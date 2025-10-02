package au.com.woolworths.android.onesite.deeplink;

import android.content.Intent;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;

    public /* synthetic */ a(String str, int i, String str2, String str3, String str4) {
        this.d = i;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws UnsupportedEncodingException {
        switch (this.d) {
            case 0:
                Intent intentA = ActivityNavigatorKt.a(Activities.CataloguePromotionDetails.f4456a, ApplicationType.e);
                intentA.putExtra("extra_promotion_details", new Activities.CataloguePromotionDetails.Extra(this.e, this.f, this.g, this.h));
                return intentA;
            default:
                Activities.ProductList.ExtrasPageData extrasPageData = new Activities.ProductList.ExtrasPageData(this.e, null);
                String strDecode = URLDecoder.decode(this.f, Charsets.f24671a.name());
                Intrinsics.g(strDecode, "decode(...)");
                return Activities.ProductList.f4505a.b(new Activities.ProductList.Extras(extrasPageData, new Activities.ProductList.ExtrasByProductGroup(strDecode, this.g, this.h, Activities.ProductList.ProductListType.x), (Activities.ProductList.ExtrasConfig) null, 4), false);
        }
    }
}
