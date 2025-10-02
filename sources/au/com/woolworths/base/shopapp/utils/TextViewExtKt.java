package au.com.woolworths.base.shopapp.utils;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base-shop-app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TextViewExtKt {
    public static final void a(TextView textView, Context context, String str, String str2, int i, int i2, final Function0 function0) {
        Intrinsics.h(textView, "<this>");
        SpannableString spannableString = new SpannableString(str);
        int iC = StringsKt.C(str, str2, 0, false, 6);
        int length = str2.length() + iC;
        spannableString.setSpan(new UnderlineSpan(), iC, length, 0);
        spannableString.setSpan(new ClickableSpan() { // from class: au.com.woolworths.base.shopapp.utils.TextViewExtKt$underlineText$1
            @Override // android.text.style.ClickableSpan
            public final void onClick(View widget) {
                Intrinsics.h(widget, "widget");
                function0.invoke();
            }
        }, iC, length, 0);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        spannableString.setSpan(new ForegroundColorSpan(context.getColor(i2)), iC, length, 33);
        textView.setTextColor(context.getColor(i));
        textView.setText(spannableString);
    }
}
