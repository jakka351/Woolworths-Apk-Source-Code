package au.com.woolworths.shop.ratingsandreviews.ui.reviewitem;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState f;

    public /* synthetic */ a(MutableState mutableState, MutableState mutableState2, int i) {
        this.d = i;
        this.e = mutableState;
        this.f = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                TextLayoutResult it = (TextLayoutResult) obj;
                Intrinsics.h(it, "it");
                if (((Boolean) this.e.getD()).booleanValue()) {
                    this.f.setValue(Boolean.valueOf(it.d()));
                }
                break;
            default:
                ((Float) obj).getClass();
                MutableState mutableState = this.e;
                if (!((Boolean) mutableState.getD()).booleanValue()) {
                    this.f.setValue(Boolean.FALSE);
                }
                mutableState.setValue(Boolean.FALSE);
                break;
        }
        return Unit.f24250a;
    }
}
