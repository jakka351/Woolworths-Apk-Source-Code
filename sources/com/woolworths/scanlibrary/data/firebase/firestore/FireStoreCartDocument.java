package com.woolworths.scanlibrary.data.firebase.firestore;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.models.cart.CartEvent;
import com.woolworths.scanlibrary.models.cart.CartStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J;\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/woolworths/scanlibrary/data/firebase/firestore/FireStoreCartDocument;", "", "cartid", "", "documentId", "status", "event", "kioskflags", "Lcom/woolworths/scanlibrary/data/firebase/firestore/FireStoreDocumentKioskFlags;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/scanlibrary/data/firebase/firestore/FireStoreDocumentKioskFlags;)V", "getCartid", "()Ljava/lang/String;", "setCartid", "(Ljava/lang/String;)V", "getDocumentId", "setDocumentId", "getStatus", "setStatus", "getEvent", "setEvent", "getKioskflags", "()Lcom/woolworths/scanlibrary/data/firebase/firestore/FireStoreDocumentKioskFlags;", "setKioskflags", "(Lcom/woolworths/scanlibrary/data/firebase/firestore/FireStoreDocumentKioskFlags;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FireStoreCartDocument {
    public static final int $stable = 8;

    @NotNull
    private String cartid;

    @NotNull
    private String documentId;

    @NotNull
    private String event;

    @NotNull
    private FireStoreDocumentKioskFlags kioskflags;

    @NotNull
    private String status;

    public FireStoreCartDocument() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ FireStoreCartDocument copy$default(FireStoreCartDocument fireStoreCartDocument, String str, String str2, String str3, String str4, FireStoreDocumentKioskFlags fireStoreDocumentKioskFlags, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fireStoreCartDocument.cartid;
        }
        if ((i & 2) != 0) {
            str2 = fireStoreCartDocument.documentId;
        }
        if ((i & 4) != 0) {
            str3 = fireStoreCartDocument.status;
        }
        if ((i & 8) != 0) {
            str4 = fireStoreCartDocument.event;
        }
        if ((i & 16) != 0) {
            fireStoreDocumentKioskFlags = fireStoreCartDocument.kioskflags;
        }
        FireStoreDocumentKioskFlags fireStoreDocumentKioskFlags2 = fireStoreDocumentKioskFlags;
        String str5 = str3;
        return fireStoreCartDocument.copy(str, str2, str5, str4, fireStoreDocumentKioskFlags2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCartid() {
        return this.cartid;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getEvent() {
        return this.event;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final FireStoreDocumentKioskFlags getKioskflags() {
        return this.kioskflags;
    }

    @NotNull
    public final FireStoreCartDocument copy(@NotNull String cartid, @NotNull String documentId, @NotNull String status, @NotNull String event, @NotNull FireStoreDocumentKioskFlags kioskflags) {
        Intrinsics.h(cartid, "cartid");
        Intrinsics.h(documentId, "documentId");
        Intrinsics.h(status, "status");
        Intrinsics.h(event, "event");
        Intrinsics.h(kioskflags, "kioskflags");
        return new FireStoreCartDocument(cartid, documentId, status, event, kioskflags);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FireStoreCartDocument)) {
            return false;
        }
        FireStoreCartDocument fireStoreCartDocument = (FireStoreCartDocument) other;
        return Intrinsics.c(this.cartid, fireStoreCartDocument.cartid) && Intrinsics.c(this.documentId, fireStoreCartDocument.documentId) && Intrinsics.c(this.status, fireStoreCartDocument.status) && Intrinsics.c(this.event, fireStoreCartDocument.event) && Intrinsics.c(this.kioskflags, fireStoreCartDocument.kioskflags);
    }

    @NotNull
    public final String getCartid() {
        return this.cartid;
    }

    @NotNull
    public final String getDocumentId() {
        return this.documentId;
    }

    @NotNull
    public final String getEvent() {
        return this.event;
    }

    @NotNull
    public final FireStoreDocumentKioskFlags getKioskflags() {
        return this.kioskflags;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.kioskflags.hashCode() + b.c(b.c(b.c(this.cartid.hashCode() * 31, 31, this.documentId), 31, this.status), 31, this.event);
    }

    public final void setCartid(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.cartid = str;
    }

    public final void setDocumentId(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.documentId = str;
    }

    public final void setEvent(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.event = str;
    }

    public final void setKioskflags(@NotNull FireStoreDocumentKioskFlags fireStoreDocumentKioskFlags) {
        Intrinsics.h(fireStoreDocumentKioskFlags, "<set-?>");
        this.kioskflags = fireStoreDocumentKioskFlags;
    }

    public final void setStatus(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.status = str;
    }

    @NotNull
    public String toString() {
        String str = this.cartid;
        String str2 = this.documentId;
        String str3 = this.status;
        String str4 = this.event;
        FireStoreDocumentKioskFlags fireStoreDocumentKioskFlags = this.kioskflags;
        StringBuilder sbV = YU.a.v("FireStoreCartDocument(cartid=", str, ", documentId=", str2, ", status=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", event=", str4, ", kioskflags=");
        sbV.append(fireStoreDocumentKioskFlags);
        sbV.append(")");
        return sbV.toString();
    }

    public FireStoreCartDocument(@NotNull String cartid, @NotNull String documentId, @NotNull String status, @NotNull String event, @NotNull FireStoreDocumentKioskFlags kioskflags) {
        Intrinsics.h(cartid, "cartid");
        Intrinsics.h(documentId, "documentId");
        Intrinsics.h(status, "status");
        Intrinsics.h(event, "event");
        Intrinsics.h(kioskflags, "kioskflags");
        this.cartid = cartid;
        this.documentId = documentId;
        this.status = status;
        this.event = event;
        this.kioskflags = kioskflags;
    }

    public /* synthetic */ FireStoreCartDocument(String str, String str2, String str3, String str4, FireStoreDocumentKioskFlags fireStoreDocumentKioskFlags, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CartStatus.UNKNOWN.getStatus() : str3, (i & 8) != 0 ? CartEvent.UNKNOWN.getEvent() : str4, (i & 16) != 0 ? new FireStoreDocumentKioskFlags(false, false, false, false, false, 31, null) : fireStoreDocumentKioskFlags);
    }
}
