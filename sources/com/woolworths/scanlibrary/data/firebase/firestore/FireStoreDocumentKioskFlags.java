package com.woolworths.scanlibrary.data.firebase.firestore;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006\""}, d2 = {"Lcom/woolworths/scanlibrary/data/firebase/firestore/FireStoreDocumentKioskFlags;", "", "isbigkioskrequired", "", "bagcheckrequired", "hasintervention", "enableinapppayment", "isbagcheckcompleted", "<init>", "(ZZZZZ)V", "getIsbigkioskrequired", "()Z", "setIsbigkioskrequired", "(Z)V", "getBagcheckrequired", "setBagcheckrequired", "getHasintervention", "setHasintervention", "getEnableinapppayment", "setEnableinapppayment", "getIsbagcheckcompleted", "setIsbagcheckcompleted", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FireStoreDocumentKioskFlags {
    public static final int $stable = 8;
    private boolean bagcheckrequired;
    private boolean enableinapppayment;
    private boolean hasintervention;
    private boolean isbagcheckcompleted;
    private boolean isbigkioskrequired;

    public FireStoreDocumentKioskFlags() {
        this(false, false, false, false, false, 31, null);
    }

    public static /* synthetic */ FireStoreDocumentKioskFlags copy$default(FireStoreDocumentKioskFlags fireStoreDocumentKioskFlags, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = fireStoreDocumentKioskFlags.isbigkioskrequired;
        }
        if ((i & 2) != 0) {
            z2 = fireStoreDocumentKioskFlags.bagcheckrequired;
        }
        if ((i & 4) != 0) {
            z3 = fireStoreDocumentKioskFlags.hasintervention;
        }
        if ((i & 8) != 0) {
            z4 = fireStoreDocumentKioskFlags.enableinapppayment;
        }
        if ((i & 16) != 0) {
            z5 = fireStoreDocumentKioskFlags.isbagcheckcompleted;
        }
        boolean z6 = z5;
        boolean z7 = z3;
        return fireStoreDocumentKioskFlags.copy(z, z2, z7, z4, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsbigkioskrequired() {
        return this.isbigkioskrequired;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getBagcheckrequired() {
        return this.bagcheckrequired;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasintervention() {
        return this.hasintervention;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEnableinapppayment() {
        return this.enableinapppayment;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsbagcheckcompleted() {
        return this.isbagcheckcompleted;
    }

    @NotNull
    public final FireStoreDocumentKioskFlags copy(boolean isbigkioskrequired, boolean bagcheckrequired, boolean hasintervention, boolean enableinapppayment, boolean isbagcheckcompleted) {
        return new FireStoreDocumentKioskFlags(isbigkioskrequired, bagcheckrequired, hasintervention, enableinapppayment, isbagcheckcompleted);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FireStoreDocumentKioskFlags)) {
            return false;
        }
        FireStoreDocumentKioskFlags fireStoreDocumentKioskFlags = (FireStoreDocumentKioskFlags) other;
        return this.isbigkioskrequired == fireStoreDocumentKioskFlags.isbigkioskrequired && this.bagcheckrequired == fireStoreDocumentKioskFlags.bagcheckrequired && this.hasintervention == fireStoreDocumentKioskFlags.hasintervention && this.enableinapppayment == fireStoreDocumentKioskFlags.enableinapppayment && this.isbagcheckcompleted == fireStoreDocumentKioskFlags.isbagcheckcompleted;
    }

    public final boolean getBagcheckrequired() {
        return this.bagcheckrequired;
    }

    public final boolean getEnableinapppayment() {
        return this.enableinapppayment;
    }

    public final boolean getHasintervention() {
        return this.hasintervention;
    }

    public final boolean getIsbagcheckcompleted() {
        return this.isbagcheckcompleted;
    }

    public final boolean getIsbigkioskrequired() {
        return this.isbigkioskrequired;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isbagcheckcompleted) + b.e(b.e(b.e(Boolean.hashCode(this.isbigkioskrequired) * 31, 31, this.bagcheckrequired), 31, this.hasintervention), 31, this.enableinapppayment);
    }

    public final void setBagcheckrequired(boolean z) {
        this.bagcheckrequired = z;
    }

    public final void setEnableinapppayment(boolean z) {
        this.enableinapppayment = z;
    }

    public final void setHasintervention(boolean z) {
        this.hasintervention = z;
    }

    public final void setIsbagcheckcompleted(boolean z) {
        this.isbagcheckcompleted = z;
    }

    public final void setIsbigkioskrequired(boolean z) {
        this.isbigkioskrequired = z;
    }

    @NotNull
    public String toString() {
        boolean z = this.isbigkioskrequired;
        boolean z2 = this.bagcheckrequired;
        boolean z3 = this.hasintervention;
        boolean z4 = this.enableinapppayment;
        boolean z5 = this.isbagcheckcompleted;
        StringBuilder sbV = b.v("FireStoreDocumentKioskFlags(isbigkioskrequired=", ", bagcheckrequired=", ", hasintervention=", z, z2);
        au.com.woolworths.android.onesite.a.D(sbV, z3, ", enableinapppayment=", z4, ", isbagcheckcompleted=");
        return YU.a.k(")", sbV, z5);
    }

    public FireStoreDocumentKioskFlags(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.isbigkioskrequired = z;
        this.bagcheckrequired = z2;
        this.hasintervention = z3;
        this.enableinapppayment = z4;
        this.isbagcheckcompleted = z5;
    }

    public /* synthetic */ FireStoreDocumentKioskFlags(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? true : z5);
    }
}
