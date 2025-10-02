package au.com.woolworths.android.onesite.ui;

import android.text.style.URLSpan;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/ui/CustomUrlSpan;", "Landroid/text/style/URLSpan;", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class CustomUrlSpan extends URLSpan {
    public final String d;
    public final String e;
    public final HtmlTextListener f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomUrlSpan(String label, String str, HtmlTextListener listener) {
        super(str);
        Intrinsics.h(label, "label");
        Intrinsics.h(listener, "listener");
        this.d = label;
        this.e = str;
        this.f = listener;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View widget) {
        Intrinsics.h(widget, "widget");
        this.f.h4(this.d, this.e);
    }
}
