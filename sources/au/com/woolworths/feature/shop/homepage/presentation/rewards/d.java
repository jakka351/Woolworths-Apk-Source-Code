package au.com.woolworths.feature.shop.homepage.presentation.rewards;

import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ MutableState f;

    public /* synthetic */ d(MutableState mutableState, Function0 function0, int i) {
        this.d = i;
        this.f = mutableState;
        this.e = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.f.setValue(Boolean.TRUE);
                this.e.invoke();
                break;
            case 1:
                this.f.setValue(Boolean.TRUE);
                this.e.invoke();
                break;
            case 2:
                this.e.invoke();
                this.f.setValue(Boolean.TRUE);
                break;
            case 3:
                this.e.invoke();
                WebView webView = (WebView) this.f.getValue();
                if (webView != null) {
                    webView.reload();
                }
                return Unit.f24250a;
            case 4:
                this.f.setValue(Boolean.FALSE);
                this.e.invoke();
                break;
            case 5:
                this.f.setValue(Boolean.TRUE);
                this.e.invoke();
                break;
            default:
                this.e.invoke();
                this.f.setValue(0);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ d(Function0 function0, MutableState mutableState, int i) {
        this.d = i;
        this.e = function0;
        this.f = mutableState;
    }
}
