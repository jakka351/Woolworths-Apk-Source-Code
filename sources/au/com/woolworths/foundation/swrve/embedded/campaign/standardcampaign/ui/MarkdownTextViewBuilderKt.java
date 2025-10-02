package au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui;

import android.content.Context;
import android.widget.TextView;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.widget.TextViewCompat;
import au.com.woolworths.design.wx.foundation.WxTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"embedded-campaign_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MarkdownTextViewBuilderKt {
    public static final TextView a(Context context, Density density, long j, TextStyle textStyle) {
        Intrinsics.h(context, "context");
        Intrinsics.h(density, "density");
        TextView textView = new TextView(context);
        textView.setTextColor(ColorKt.j(j));
        ParagraphStyle paragraphStyle = textStyle.b;
        long j2 = paragraphStyle.c;
        if ((1095216660480L & j2) != 0) {
            TextViewCompat.a(textView, (int) density.t1(j2));
        }
        textView.setTextSize(TextUnit.c(textStyle.f2068a.fontSize));
        int i = paragraphStyle.f2049a;
        int i2 = 1;
        if (i == 1 || i == 5) {
            i2 = 8388611;
        } else if (i == 2 || i == 6) {
            i2 = 8388613;
        } else if (i != 3) {
            i2 = 0;
        }
        textView.setGravity(i2);
        return textView;
    }

    public static final TextStyle b(Composer composer) {
        composer.o(1942949123);
        TextStyle textStyleA = TextStyle.a(WxTheme.b(composer).n, 0L, 0L, null, null, 0L, TextUnitKt.c(20), null, null, 0, 16613375);
        composer.l();
        return textStyleA;
    }
}
