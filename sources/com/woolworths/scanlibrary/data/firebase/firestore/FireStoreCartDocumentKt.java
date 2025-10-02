package com.woolworths.scanlibrary.data.firebase.firestore;

import com.woolworths.scanlibrary.models.profile.KioskFlags;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"scanGoLibrary_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FireStoreCartDocumentKt {
    public static final KioskFlags a(FireStoreDocumentKioskFlags fireStoreDocumentKioskFlags) {
        Intrinsics.h(fireStoreDocumentKioskFlags, "<this>");
        return new KioskFlags(fireStoreDocumentKioskFlags.getIsbigkioskrequired(), fireStoreDocumentKioskFlags.getBagcheckrequired(), fireStoreDocumentKioskFlags.getHasintervention(), fireStoreDocumentKioskFlags.getEnableinapppayment(), fireStoreDocumentKioskFlags.getIsbagcheckcompleted());
    }
}
