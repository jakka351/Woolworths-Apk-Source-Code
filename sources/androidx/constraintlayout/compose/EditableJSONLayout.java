package androidx.constraintlayout.compose;

import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.PublishedApi;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/EditableJSONLayout;", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@PublishedApi
/* loaded from: classes2.dex */
public abstract class EditableJSONLayout implements LayoutInformationReceiver {
    public MutableLongState d;

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public final void c(MutableLongState mutableLongState) {
        this.d = mutableLongState;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public final LayoutInfoFlags g() {
        return null;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public final void j() {
        System.nanoTime();
    }
}
