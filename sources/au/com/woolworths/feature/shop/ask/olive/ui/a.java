package au.com.woolworths.feature.shop.ask.olive.ui;

import android.webkit.ValueCallback;
import androidx.lifecycle.ViewModelKt;
import java.util.UUID;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AskOliveActivity f6623a;

    public /* synthetic */ a(AskOliveActivity askOliveActivity) {
        this.f6623a = askOliveActivity;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String str = (String) obj;
        int i = AskOliveActivity.I;
        String strL0 = str != null ? StringsKt.l0(str, '\"') : null;
        if (strL0 != null) {
            AskOliveViewModel askOliveViewModelR4 = this.f6623a.R4();
            try {
                UUID.fromString(strL0);
                BuildersKt.c(ViewModelKt.a(askOliveViewModelR4), null, null, new AskOliveViewModel$setChatbotSessionId$1(askOliveViewModelR4, strL0, null), 3);
            } catch (IllegalArgumentException unused) {
                int i2 = askOliveViewModelR4.t;
                if (i2 < 10) {
                    askOliveViewModelR4.t = i2 + 1;
                    BuildersKt.c(ViewModelKt.a(askOliveViewModelR4), null, null, new AskOliveViewModel$retryChatbotSessionId$1(askOliveViewModelR4, null), 3);
                }
            }
        }
    }
}
