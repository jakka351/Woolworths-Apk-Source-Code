package io.grpc.stub;

import io.grpc.Internal;

@Internal
/* loaded from: classes7.dex */
public final class InternalClientCalls {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class StubType {
        public static final /* synthetic */ StubType[] d = {new StubType("BLOCKING", 0), new StubType("ASYNC", 1), new StubType("FUTURE", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        StubType EF5;

        public static StubType valueOf(String str) {
            return (StubType) Enum.valueOf(StubType.class, str);
        }

        public static StubType[] values() {
            return (StubType[]) d.clone();
        }
    }
}
