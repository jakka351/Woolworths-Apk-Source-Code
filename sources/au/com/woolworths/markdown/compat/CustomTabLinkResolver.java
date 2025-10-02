package au.com.woolworths.markdown.compat;

import io.noties.markwon.LinkResolver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/markdown/compat/CustomTabLinkResolver;", "Lio/noties/markwon/LinkResolver;", "markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CustomTabLinkResolver implements LinkResolver {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f9043a;

    public CustomTabLinkResolver(Function2 function2) {
        this.f9043a = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    @Override // io.noties.markwon.LinkResolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.View r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.h(r9, r0)
            java.lang.String r0 = "link"
            kotlin.jvm.internal.Intrinsics.h(r10, r0)
            android.content.Context r0 = r9.getContext()
            java.lang.String r1 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.g(r0, r1)
            r1 = 0
            r2 = 1
            androidx.browser.customtabs.CustomTabsIntent$Builder r3 = new androidx.browser.customtabs.CustomTabsIntent$Builder     // Catch: android.content.ActivityNotFoundException -> L50
            r3.<init>()     // Catch: android.content.ActivityNotFoundException -> L50
            androidx.browser.customtabs.CustomTabColorSchemeParams$Builder r4 = new androidx.browser.customtabs.CustomTabColorSchemeParams$Builder     // Catch: android.content.ActivityNotFoundException -> L50
            r4.<init>()     // Catch: android.content.ActivityNotFoundException -> L50
            android.util.TypedValue r5 = new android.util.TypedValue     // Catch: android.content.ActivityNotFoundException -> L50
            r5.<init>()     // Catch: android.content.ActivityNotFoundException -> L50
            android.content.res.Resources$Theme r6 = r0.getTheme()     // Catch: android.content.ActivityNotFoundException -> L50
            r7 = 16842801(0x1010031, float:2.3693695E-38)
            r6.resolveAttribute(r7, r5, r2)     // Catch: android.content.ActivityNotFoundException -> L50
            int r5 = r5.data     // Catch: android.content.ActivityNotFoundException -> L50
            r4.b(r5)     // Catch: android.content.ActivityNotFoundException -> L50
            androidx.browser.customtabs.CustomTabColorSchemeParams r4 = r4.a()     // Catch: android.content.ActivityNotFoundException -> L50
            android.os.Bundle r4 = r4.b()     // Catch: android.content.ActivityNotFoundException -> L50
            r3.e = r4     // Catch: android.content.ActivityNotFoundException -> L50
            androidx.browser.customtabs.CustomTabsIntent r3 = r3.a()     // Catch: android.content.ActivityNotFoundException -> L50
            android.content.Intent r4 = r3.f208a
            r5 = 1073741824(0x40000000, float:2.0)
            r4.addFlags(r5)     // Catch: android.content.ActivityNotFoundException -> L50
            android.net.Uri r4 = android.net.Uri.parse(r10)     // Catch: android.content.ActivityNotFoundException -> L50
            r3.b(r0, r4)     // Catch: android.content.ActivityNotFoundException -> L50
            goto L5a
        L50:
            r3 = 2132018368(0x7f1404c0, float:1.967504E38)
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r3, r1)
            r0.show()
        L5a:
            kotlin.jvm.functions.Function2 r0 = r8.f9043a
            if (r0 == 0) goto Lad
            boolean r3 = r9 instanceof android.widget.TextView
            if (r3 == 0) goto L65
            android.widget.TextView r9 = (android.widget.TextView) r9
            goto L66
        L65:
            r9 = 0
        L66:
            if (r9 == 0) goto L9b
            int r3 = r9.getSelectionStart()
            if (r3 < 0) goto L9b
            int r3 = r9.getSelectionEnd()
            java.lang.CharSequence r4 = r9.getText()
            java.lang.String r5 = "getText(...)"
            kotlin.jvm.internal.Intrinsics.g(r4, r5)
            int r4 = kotlin.text.StringsKt.A(r4)
            int r4 = r4 + r2
            if (r3 <= r4) goto L83
            goto L9b
        L83:
            java.lang.CharSequence r1 = r9.getText()
            kotlin.jvm.internal.Intrinsics.g(r1, r5)
            int r2 = r9.getSelectionStart()
            int r9 = r9.getSelectionEnd()
            java.lang.CharSequence r9 = r1.subSequence(r2, r9)
            java.lang.String r9 = r9.toString()
            goto Laa
        L9b:
            timber.log.Timber$Forest r9 = timber.log.Timber.f27013a
            java.lang.String r2 = "Cannot retrieve link text for url clicked "
            java.lang.String r2 = r2.concat(r10)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r9.o(r2, r1)
            java.lang.String r9 = ""
        Laa:
            r0.invoke(r10, r9)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.markdown.compat.CustomTabLinkResolver.a(android.view.View, java.lang.String):void");
    }
}
