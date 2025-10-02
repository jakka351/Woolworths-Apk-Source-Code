package au.com.woolworths.feature.shop.ask.olive.ui;

import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import au.com.woolworths.feature.shop.ask.olive.databinding.ActivityChatWithOliveBinding;
import au.com.woolworths.feature.shop.ask.olive.ui.AskOliveContract;
import au.com.woolworths.feature.shop.ask.olive.ui.model.ChatWebLink;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                AskOliveActivity askOliveActivity = (AskOliveActivity) obj2;
                int i2 = AskOliveActivity.I;
                ChatWebLink chatWebLink = ((AskOliveContract.ViewState) obj).f6619a;
                if (chatWebLink != null) {
                    ActivityChatWithOliveBinding activityChatWithOliveBinding = askOliveActivity.B;
                    if (activityChatWithOliveBinding == null) {
                        Intrinsics.p("binding");
                        throw null;
                    }
                    activityChatWithOliveBinding.A.loadUrl(chatWebLink.f6634a, chatWebLink.b);
                }
                return unit;
            case 1:
                AskOliveActivity askOliveActivity2 = (AskOliveActivity) obj2;
                Intent intent = (Intent) obj;
                int i3 = AskOliveActivity$initWebView$1$3.b;
                if (intent != null) {
                    askOliveActivity2.startActivityForResult(intent, 1011);
                } else {
                    askOliveActivity2.Q4().d();
                }
                return unit;
            case 2:
                AskOliveActivity askOliveActivity3 = (AskOliveActivity) obj2;
                Intent intent2 = (Intent) obj;
                int i4 = AskOliveActivity$initWebView$1$3.b;
                askOliveActivity3.E = intent2;
                if (intent2 != null) {
                    if (askOliveActivity3.checkSelfPermission("android.permission.CAMERA") == 0) {
                        askOliveActivity3.startActivityForResult(intent2, 1010);
                    } else {
                        ActivityResultLauncher activityResultLauncher = askOliveActivity3.G;
                        Intrinsics.h(activityResultLauncher, "<this>");
                        activityResultLauncher.a(unit, null);
                    }
                }
                return unit;
            default:
                ((AskOliveViewModel) obj2).s = null;
                return unit;
        }
    }
}
