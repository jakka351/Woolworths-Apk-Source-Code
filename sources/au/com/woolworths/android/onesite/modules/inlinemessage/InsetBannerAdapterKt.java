package au.com.woolworths.android.onesite.modules.inlinemessage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.navigation.compose.a;
import au.com.woolworths.android.onesite.base.R;
import au.com.woolworths.android.onesite.extensions.SpannableStringExtKt;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.common.InlineErrorAction;
import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InsetBannerAdapterKt {
    public static final void a(TextView textView, InsetBanner insetBanner, InsetBannerClickListener insetBannerClickListener) {
        InlineErrorAction e;
        Text textA;
        int iA;
        Intrinsics.h(textView, "textView");
        if (insetBanner == null || (e = insetBanner.getE()) == null || (textA = e.a()) == null) {
            return;
        }
        Context context = textView.getContext();
        Intrinsics.e(context);
        String string = textA.getText(context).toString();
        SpannableString spannableString = new SpannableString(string);
        SpannableStringExtKt.a(spannableString, string, null, new a(3, insetBannerClickListener, insetBanner));
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(insetBanner.getF().d, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(typedValue.resourceId, R.styleable.b);
        Intrinsics.g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(2);
        typedArrayObtainStyledAttributes.recycle();
        textView.setLinkTextColor(colorStateList);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        if (colorStateList != null) {
            iA = colorStateList.getDefaultColor();
        } else {
            InlineErrorType f = insetBanner.getF();
            f.getClass();
            iA = f.a(1, context);
        }
        textView.setHighlightColor(ColorUtils.e(iA, 25));
    }
}
