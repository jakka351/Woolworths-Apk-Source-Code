package kotlin.text;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SinceKotlin
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/text/HexFormat;", "", "BytesHexFormat", "NumberHexFormat", "Builder", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@WasExperimental
/* loaded from: classes7.dex */
public final class HexFormat {
    public static final HexFormat d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24674a;
    public final BytesHexFormat b;
    public final NumberHexFormat c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/HexFormat$Builder;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Builder {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/text/HexFormat$BytesHexFormat;", "", "Builder", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BytesHexFormat {

        /* renamed from: a, reason: collision with root package name */
        public static final BytesHexFormat f24675a;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Builder {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/HexFormat$BytesHexFormat$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
        }

        static {
            BytesHexFormat bytesHexFormat = new BytesHexFormat();
            if (!HexFormatKt.a("  ") && !HexFormatKt.a("") && !HexFormatKt.a("")) {
                HexFormatKt.a("");
            }
            f24675a = bytesHexFormat;
        }

        public final void a(StringBuilder sb, String str) {
            YU.a.x(Integer.MAX_VALUE, str, "bytesPerLine = ", ",", sb);
            sb.append('\n');
            sb.append(str);
            sb.append("bytesPerGroup = ");
            sb.append(Integer.MAX_VALUE);
            sb.append(",");
            sb.append('\n');
            sb.append(str);
            sb.append("groupSeparator = \"");
            sb.append("  ");
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("byteSeparator = \"");
            sb.append("");
            sb.append("\",");
            sb.append('\n');
            androidx.constraintlayout.core.state.a.B(sb, str, "bytePrefix = \"", "", "\",");
            sb.append('\n');
            sb.append(str);
            sb.append("byteSuffix = \"");
            sb.append("");
            sb.append("\"");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BytesHexFormat(\n");
            a(sb, "    ");
            sb.append('\n');
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/HexFormat$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/text/HexFormat$NumberHexFormat;", "", "Builder", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NumberHexFormat {
        public static final NumberHexFormat b = new NumberHexFormat();

        /* renamed from: a, reason: collision with root package name */
        public final boolean f24676a = true;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @SourceDebugExtension
        public static final class Builder {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/HexFormat$NumberHexFormat$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
        }

        public NumberHexFormat() {
            if (HexFormatKt.a("")) {
                return;
            }
            HexFormatKt.a("");
        }

        public final void a(StringBuilder sb, String str) {
            androidx.constraintlayout.core.state.a.B(sb, str, "prefix = \"", "", "\",");
            sb.append('\n');
            sb.append(str);
            sb.append("suffix = \"");
            sb.append("");
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("removeLeadingZeros = ");
            sb.append(false);
            sb.append(',');
            sb.append('\n');
            sb.append(str);
            sb.append("minLength = ");
            sb.append(1);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NumberHexFormat(\n");
            a(sb, "    ");
            sb.append('\n');
            sb.append(")");
            return sb.toString();
        }
    }

    static {
        BytesHexFormat bytesHexFormat = BytesHexFormat.f24675a;
        NumberHexFormat numberHexFormat = NumberHexFormat.b;
        d = new HexFormat(false, bytesHexFormat, numberHexFormat);
        new HexFormat(true, bytesHexFormat, numberHexFormat);
    }

    public HexFormat(boolean z, BytesHexFormat bytes, NumberHexFormat number) {
        Intrinsics.h(bytes, "bytes");
        Intrinsics.h(number, "number");
        this.f24674a = z;
        this.b = bytes;
        this.c = number;
    }

    public final String toString() {
        StringBuilder sbS = YU.a.s("HexFormat(\n    upperCase = ");
        sbS.append(this.f24674a);
        sbS.append(",\n    bytes = BytesHexFormat(\n");
        this.b.a(sbS, "        ");
        sbS.append('\n');
        sbS.append("    ),");
        sbS.append('\n');
        sbS.append("    number = NumberHexFormat(");
        sbS.append('\n');
        this.c.a(sbS, "        ");
        sbS.append('\n');
        sbS.append("    )");
        sbS.append('\n');
        sbS.append(")");
        return sbS.toString();
    }
}
