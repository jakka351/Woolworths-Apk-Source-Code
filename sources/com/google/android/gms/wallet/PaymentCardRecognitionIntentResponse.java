package com.google.android.gms.wallet;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PaymentCardRecognitionIntentResponseCreator")
/* loaded from: classes2.dex */
public class PaymentCardRecognitionIntentResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PaymentCardRecognitionIntentResponse> CREATOR = new zzz();

    @SafeParcelable.Field(id = 1)
    PendingIntent zza;

    public PaymentCardRecognitionIntentResponse() {
    }

    @NonNull
    public PendingIntent getPaymentCardRecognitionPendingIntent() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public PaymentCardRecognitionIntentResponse(@SafeParcelable.Param(id = 1) PendingIntent pendingIntent) {
        this.zza = pendingIntent;
    }
}
