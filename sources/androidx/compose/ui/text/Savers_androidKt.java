package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Savers_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final SaverKt$Saver$1 f2057a;
    public static final SaverKt$Saver$1 b;
    public static final SaverKt$Saver$1 c;

    static {
        SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f1701a;
        f2057a = new SaverKt$Saver$1(Savers_androidKt$PlatformParagraphStyleSaver$2.h, Savers_androidKt$PlatformParagraphStyleSaver$1.h);
        b = new SaverKt$Saver$1(Savers_androidKt$LineBreakSaver$2.h, Savers_androidKt$LineBreakSaver$1.h);
        c = new SaverKt$Saver$1(Savers_androidKt$TextMotionSaver$2.h, Savers_androidKt$TextMotionSaver$1.h);
    }

    public static final SaverKt$Saver$1 a() {
        return f2057a;
    }

    public static final SaverKt$Saver$1 b() {
        return b;
    }

    public static final SaverKt$Saver$1 c() {
        return c;
    }
}
