package au.com.woolworths.checkbox;

import androidx.compose.ui.state.ToggleableState;
import androidx.databinding.adapters.ListenerUtil;
import au.com.woolworths.checkbox.IndeterminateCheckBox;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"indeterminate-checkbox_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class IndeterminateCheckBoxBindingAdaptersKt {
    public static final void a(IndeterminateCheckBox checkBox, final OnStateChangedListener onStateChangedListener) {
        Intrinsics.h(checkBox, "checkBox");
        Intrinsics.h(onStateChangedListener, "onStateChangedListener");
        IndeterminateCheckBox.OnStateChangedListener onStateChangedListener2 = new IndeterminateCheckBox.OnStateChangedListener() { // from class: au.com.woolworths.checkbox.IndeterminateCheckBoxBindingAdaptersKt$setStateChangedListener$1
            @Override // au.com.woolworths.checkbox.IndeterminateCheckBox.OnStateChangedListener
            public final void a(ToggleableState newState) {
                Intrinsics.h(newState, "newState");
                onStateChangedListener.a(newState);
            }
        };
        int i = ListenerUtil.f2553a;
        checkBox.getTag(com.woolworths.R.id.stateChangedListener);
        checkBox.setTag(com.woolworths.R.id.stateChangedListener, onStateChangedListener2);
        checkBox.setOnStateChangedListener(onStateChangedListener2);
    }
}
