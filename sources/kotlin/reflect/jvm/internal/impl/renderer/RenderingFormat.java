package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class RenderingFormat {
    public static final RenderingFormat d;
    public static final RenderingFormat e;
    public static final /* synthetic */ RenderingFormat[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        RenderingFormat renderingFormat = new RenderingFormat() { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.PLAIN
            @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
            public final String a(String string) {
                Intrinsics.h(string, "string");
                return string;
            }
        };
        d = renderingFormat;
        RenderingFormat renderingFormat2 = new RenderingFormat() { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML
            @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
            public final String a(String string) {
                Intrinsics.h(string, "string");
                return StringsKt.Q(StringsKt.Q(string, "<", "&lt;", false), ">", "&gt;", false);
            }
        };
        e = renderingFormat2;
        RenderingFormat[] renderingFormatArr = {renderingFormat, renderingFormat2};
        f = renderingFormatArr;
        g = EnumEntriesKt.a(renderingFormatArr);
    }

    public static RenderingFormat valueOf(String str) {
        return (RenderingFormat) Enum.valueOf(RenderingFormat.class, str);
    }

    public static RenderingFormat[] values() {
        return (RenderingFormat[]) f.clone();
    }

    public abstract String a(String str);
}
