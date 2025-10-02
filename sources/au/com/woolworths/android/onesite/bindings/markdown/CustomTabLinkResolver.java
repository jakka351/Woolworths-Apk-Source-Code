package au.com.woolworths.android.onesite.bindings.markdown;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.handlers.LinkHandler;
import io.noties.markwon.LinkResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/bindings/markdown/CustomTabLinkResolver;", "Lio/noties/markwon/LinkResolver;", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CustomTabLinkResolver implements LinkResolver {

    /* renamed from: a, reason: collision with root package name */
    public final LinkHandler f4232a;

    public CustomTabLinkResolver(LinkHandler linkHandler) {
        this.f4232a = linkHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c A[RETURN] */
    @Override // io.noties.markwon.LinkResolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.View r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.h(r10, r0)
            java.lang.String r0 = "link"
            kotlin.jvm.internal.Intrinsics.h(r11, r0)
            au.com.woolworths.android.onesite.handlers.LinkHandler r0 = r9.f4232a
            if (r0 == 0) goto L6d
            boolean r1 = r10 instanceof android.widget.TextView
            r2 = 0
            if (r1 == 0) goto L17
            r1 = r10
            android.widget.TextView r1 = (android.widget.TextView) r1
            goto L18
        L17:
            r1 = r2
        L18:
            if (r1 == 0) goto L4e
            int r3 = r1.getSelectionStart()
            if (r3 < 0) goto L4e
            int r3 = r1.getSelectionEnd()
            java.lang.CharSequence r4 = r1.getText()
            java.lang.String r5 = "getText(...)"
            kotlin.jvm.internal.Intrinsics.g(r4, r5)
            int r4 = kotlin.text.StringsKt.A(r4)
            int r4 = r4 + 1
            if (r3 <= r4) goto L36
            goto L4e
        L36:
            java.lang.CharSequence r3 = r1.getText()
            kotlin.jvm.internal.Intrinsics.g(r3, r5)
            int r4 = r1.getSelectionStart()
            int r1 = r1.getSelectionEnd()
            java.lang.CharSequence r1 = r3.subSequence(r4, r1)
            java.lang.String r1 = r1.toString()
            goto L5e
        L4e:
            timber.log.Timber$Forest r1 = timber.log.Timber.f27013a
            java.lang.String r3 = "Cannot retrieve link text for url clicked "
            java.lang.String r3 = r3.concat(r11)
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r1.o(r3, r4)
            java.lang.String r1 = ""
        L5e:
            boolean r0 = r0.U3(r11, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L69
            r2 = r1
        L69:
            if (r2 != 0) goto L6c
            goto L6d
        L6c:
            return
        L6d:
            android.content.Context r3 = r10.getContext()
            java.lang.String r10 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.g(r3, r10)
            r7 = 0
            r8 = 62
            r5 = 0
            r6 = 0
            r4 = r11
            au.com.woolworths.android.onesite.extensions.ContextExtKt.j(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.bindings.markdown.CustomTabLinkResolver.a(android.view.View, java.lang.String):void");
    }
}
