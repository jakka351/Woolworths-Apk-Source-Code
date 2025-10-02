package au.com.woolworths.design.wx.component.bottomsheet;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ModalBottomSheetState e;

    public /* synthetic */ a(ModalBottomSheetState modalBottomSheetState, int i) {
        this.d = i;
        this.e = modalBottomSheetState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                ModalBottomSheetState modalBottomSheetState = this.e;
                return Boolean.valueOf(((ModalBottomSheetValue) modalBottomSheetState.c.h.getD()) == ModalBottomSheetValue.e && ((SnapshotMutableFloatStateImpl) modalBottomSheetState.c.j).a() <= BitmapDescriptorFactory.HUE_RED);
            default:
                return this.e.b();
        }
    }
}
