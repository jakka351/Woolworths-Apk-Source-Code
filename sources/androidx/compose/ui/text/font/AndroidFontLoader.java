package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFontLoader;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidFontLoader implements PlatformFontLoader {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2089a;

    public AndroidFontLoader(@NotNull Context context) {
        this.f2089a = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(androidx.compose.ui.text.font.Font r13, kotlin.coroutines.Continuation r14) throws android.content.res.Resources.NotFoundException {
        /*
            r12 = this;
            boolean r0 = r14 instanceof androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = (androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L1a
        L13:
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = new androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r14 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r14
            r0.<init>(r12, r14)
        L1a:
            java.lang.Object r14 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            androidx.compose.ui.text.font.ResourceFont r13 = r0.q
            androidx.compose.ui.text.font.AndroidFontLoader r0 = r0.p
            kotlin.ResultKt.b(r14)
            goto L85
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L38:
            kotlin.ResultKt.b(r14)
            return r14
        L3c:
            kotlin.ResultKt.b(r14)
            boolean r14 = r13 instanceof androidx.compose.ui.text.font.AndroidFont
            if (r14 != 0) goto La6
            boolean r14 = r13 instanceof androidx.compose.ui.text.font.ResourceFont
            if (r14 == 0) goto L92
            r14 = r13
            androidx.compose.ui.text.font.ResourceFont r14 = (androidx.compose.ui.text.font.ResourceFont) r14
            r0.p = r12
            r0.q = r14
            r0.t = r3
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r0)
            r2.<init>(r4, r0)
            r2.o()
            int r6 = r14.f2104a
            androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2$1 r9 = new androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2$1
            r9.<init>()
            java.lang.ThreadLocal r14 = androidx.core.content.res.ResourcesCompat.f2423a
            android.content.Context r5 = r12.f2089a
            boolean r14 = r5.isRestricted()
            if (r14 == 0) goto L72
            r14 = -4
            r9.a(r14)
            goto L7d
        L72:
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            r10 = 0
            r11 = 0
            r8 = 0
            androidx.core.content.res.ResourcesCompat.f(r5, r6, r7, r8, r9, r10, r11)
        L7d:
            java.lang.Object r14 = r2.n()
            if (r14 != r1) goto L84
            return r1
        L84:
            r0 = r12
        L85:
            android.graphics.Typeface r14 = (android.graphics.Typeface) r14
            androidx.compose.ui.text.font.ResourceFont r13 = (androidx.compose.ui.text.font.ResourceFont) r13
            androidx.compose.ui.text.font.FontVariation$Settings r13 = r13.c
            android.content.Context r0 = r0.f2089a
            android.graphics.Typeface r13 = androidx.compose.ui.text.font.PlatformTypefaces_androidKt.a(r14, r13, r0)
            return r13
        L92:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown font type: "
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            throw r14
        La6:
            r0.t = r4
            r13 = 0
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AndroidFontLoader.a(androidx.compose.ui.text.font.Font, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object b(Font font) {
        if (font instanceof AndroidFont) {
            throw null;
        }
        if (!(font instanceof ResourceFont)) {
            return null;
        }
        ResourceFont resourceFont = (ResourceFont) font;
        int i = resourceFont.f2104a;
        Context context = this.f2089a;
        android.graphics.Typeface typefaceE = ResourcesCompat.e(i, context);
        Intrinsics.e(typefaceE);
        return PlatformTypefaces_androidKt.a(typefaceE, resourceFont.c, context);
    }
}
