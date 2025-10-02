package io.grpc;

import javax.annotation.concurrent.ThreadSafe;

@ExperimentalApi
@ThreadSafe
/* loaded from: classes7.dex */
public abstract class ChannelLogger {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ChannelLogLevel {
        public static final ChannelLogLevel d;
        public static final ChannelLogLevel e;
        public static final ChannelLogLevel f;
        public static final ChannelLogLevel g;
        public static final /* synthetic */ ChannelLogLevel[] h;

        static {
            ChannelLogLevel channelLogLevel = new ChannelLogLevel("DEBUG", 0);
            d = channelLogLevel;
            ChannelLogLevel channelLogLevel2 = new ChannelLogLevel("INFO", 1);
            e = channelLogLevel2;
            ChannelLogLevel channelLogLevel3 = new ChannelLogLevel("WARNING", 2);
            f = channelLogLevel3;
            ChannelLogLevel channelLogLevel4 = new ChannelLogLevel("ERROR", 3);
            g = channelLogLevel4;
            h = new ChannelLogLevel[]{channelLogLevel, channelLogLevel2, channelLogLevel3, channelLogLevel4};
        }

        public static ChannelLogLevel valueOf(String str) {
            return (ChannelLogLevel) Enum.valueOf(ChannelLogLevel.class, str);
        }

        public static ChannelLogLevel[] values() {
            return (ChannelLogLevel[]) h.clone();
        }
    }

    public abstract void a(ChannelLogLevel channelLogLevel, String str);

    public abstract void b(ChannelLogLevel channelLogLevel, String str, Object... objArr);
}
