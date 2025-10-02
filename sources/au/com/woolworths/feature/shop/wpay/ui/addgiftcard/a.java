package au.com.woolworths.feature.shop.wpay.ui.addgiftcard;

import au.com.woolworths.foundation.swrve.embedded.campaign.consumer.StandardCampaignContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function1 f;

    public /* synthetic */ a(Function0 function0, Function1 function1, int i) {
        this.d = i;
        this.e = function0;
        this.f = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                String it = (String) obj;
                Intrinsics.h(it, "it");
                this.e.invoke();
                StringBuilder sb = new StringBuilder();
                int length = it.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = it.charAt(i);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                this.f.invoke(StringsKt.f0(19, sb.toString()));
                break;
            case 1:
                String it2 = (String) obj;
                Intrinsics.h(it2, "it");
                this.e.invoke();
                StringBuilder sb2 = new StringBuilder();
                int length2 = it2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    char cCharAt2 = it2.charAt(i2);
                    if (Character.isDigit(cCharAt2)) {
                        sb2.append(cCharAt2);
                    }
                }
                this.f.invoke(StringsKt.f0(4, sb2.toString()));
                break;
            case 2:
                StandardCampaignContent.Cta it3 = (StandardCampaignContent.Cta) obj;
                Intrinsics.h(it3, "it");
                this.f.invoke(it3);
                this.e.invoke();
                break;
            default:
                StandardCampaignContent.Cta it4 = (StandardCampaignContent.Cta) obj;
                Intrinsics.h(it4, "it");
                this.f.invoke(it4);
                this.e.invoke();
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(Function1 function1, Function0 function0, int i) {
        this.d = i;
        this.f = function1;
        this.e = function0;
    }
}
