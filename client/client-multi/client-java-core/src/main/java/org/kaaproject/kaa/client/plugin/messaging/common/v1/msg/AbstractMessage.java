/*
 * Copyright 2014-2015 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kaaproject.kaa.client.plugin.messaging.common.v1.msg;

import java.nio.ByteBuffer;
import java.util.UUID;

public abstract class AbstractMessage implements Message {

    private static final int MESSAGE_HEADER_SIZE = 16 + 2 + 2;

    private final UUID uid;
    private final short methodId;

    protected AbstractMessage(UUID uid, short methodId) {
        super();
        this.uid = uid;
        this.methodId = methodId;
    }

    @Override
    public UUID getUid() {
        return uid;
    }

    @Override
    public short getMethodId() {
        return methodId;
    }

    @Override
    public int getSize() {
        return MESSAGE_HEADER_SIZE;
    }

    @Override
    public void pushTo(ByteBuffer bb) {
        bb.putLong(this.getUid().getMostSignificantBits());
        bb.putLong(this.getUid().getLeastSignificantBits());
        bb.putShort(this.getMethodId());
        bb.putShort(this.getType().getCode());
    }
}
