package com.woolworths.scanlibrary.ui.stores.dto;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/stores/dto/StateDTO;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class StateDTO {

    /* renamed from: a, reason: collision with root package name */
    public final String f21343a;
    public boolean b;

    public StateDTO(String state, boolean z) {
        Intrinsics.h(state, "state");
        this.f21343a = state;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StateDTO)) {
            return false;
        }
        StateDTO stateDTO = (StateDTO) obj;
        return Intrinsics.c(this.f21343a, stateDTO.f21343a) && this.b == stateDTO.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f21343a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("StateDTO(state=", this.f21343a, ", selected=", this.b, ")");
    }
}
