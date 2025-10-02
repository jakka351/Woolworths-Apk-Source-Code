package au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui;

import android.content.Context;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Density e;
    public final /* synthetic */ long f;
    public final /* synthetic */ TextStyle g;

    public /* synthetic */ a(Density density, long j, TextStyle textStyle, int i) {
        this.d = i;
        this.e = density;
        this.f = j;
        this.g = textStyle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(it, "it");
                break;
            default:
                Intrinsics.h(it, "it");
                break;
        }
        return MarkdownTextViewBuilderKt.a(it, this.e, this.f, this.g);
    }
}
