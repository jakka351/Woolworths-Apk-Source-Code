package com.google.android.material.textfield;

import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes6.dex */
class CustomEndIconDelegate extends EndIconDelegate {
    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void q() {
        EndCompoundLayout endCompoundLayout = this.b;
        endCompoundLayout.r = null;
        CheckableImageButton checkableImageButton = endCompoundLayout.j;
        checkableImageButton.setOnLongClickListener(null);
        IconHelper.d(checkableImageButton, null);
    }
}
