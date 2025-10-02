package au.com.woolworths.markdown.compat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.android.onesite.extensions.IntExtKt;
import coil3.Extras;
import coil3.Image_androidKt;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import coil3.util.ContextsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ c(int i, int i2) {
        this.d = i2;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        int i2 = this.e;
        switch (i) {
            case 0:
                Context context = (Context) obj;
                Intrinsics.h(context, "context");
                View viewInflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) null, false);
                Intrinsics.f(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
                break;
            case 1:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.k(semantics, "Price " + IntExtKt.c(i2));
                break;
            case 2:
                Context context2 = (Context) obj;
                Intrinsics.h(context2, "context");
                TextView textView = new TextView(context2);
                textView.setTextColor(i2);
                break;
            case 3:
                SemanticsPropertyReceiver semantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics2, "$this$semantics");
                if (i2 <= 0) {
                    SemanticsPropertiesKt.g(semantics2);
                    break;
                } else {
                    SemanticsPropertiesKt.k(semantics2, "Review form contains errors, please correct below errors before submitting");
                    break;
                }
            case 4:
                Extras.Key key = ImageRequests_androidKt.f13142a;
                break;
            default:
                Extras.Key key2 = ImageRequests_androidKt.f13142a;
                break;
        }
        return Image_androidKt.b(ContextsKt.a(i2, ((ImageRequest) obj).f13137a));
    }
}
