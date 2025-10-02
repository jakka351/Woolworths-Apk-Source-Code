package com.woolworths.shop.healthylife.foodtracker;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.healthylife.foodtracker.adapter.UpdateFoodTrackerConsentMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/UpdateFoodTrackerConsentMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/shop/healthylife/foodtracker/UpdateFoodTrackerConsentMutation$Data;", "Data", "UpdateFoodTrackerConsent", "Companion", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UpdateFoodTrackerConsentMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22753a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/UpdateFoodTrackerConsentMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/UpdateFoodTrackerConsentMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final UpdateFoodTrackerConsent f22754a;

        public Data(UpdateFoodTrackerConsent updateFoodTrackerConsent) {
            this.f22754a = updateFoodTrackerConsent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f22754a, ((Data) obj).f22754a);
        }

        public final int hashCode() {
            UpdateFoodTrackerConsent updateFoodTrackerConsent = this.f22754a;
            if (updateFoodTrackerConsent == null) {
                return 0;
            }
            return updateFoodTrackerConsent.hashCode();
        }

        public final String toString() {
            return "Data(updateFoodTrackerConsent=" + this.f22754a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/UpdateFoodTrackerConsentMutation$UpdateFoodTrackerConsent;", "", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdateFoodTrackerConsent {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f22755a;
        public final String b;

        public UpdateFoodTrackerConsent(boolean z, String str) {
            this.f22755a = z;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateFoodTrackerConsent)) {
                return false;
            }
            UpdateFoodTrackerConsent updateFoodTrackerConsent = (UpdateFoodTrackerConsent) obj;
            return this.f22755a == updateFoodTrackerConsent.f22755a && Intrinsics.c(this.b, updateFoodTrackerConsent.b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f22755a) * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.m("UpdateFoodTrackerConsent(status=", this.f22755a, ", message=", this.b, ")");
        }
    }

    public UpdateFoodTrackerConsentMutation(boolean z) {
        this.f22753a = z;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(UpdateFoodTrackerConsentMutation_ResponseAdapter.Data.f22772a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation UpdateFoodTrackerConsent($consentStatus: Boolean!) { updateFoodTrackerConsent(consentStatus: $consentStatus) { status message } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateFoodTrackerConsentMutation) && this.f22753a == ((UpdateFoodTrackerConsentMutation) obj).f22753a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22753a);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "ab8743a2fad5cf5c33cf489391c13e6a843be41acdb4ba572f698a187c13b914";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "UpdateFoodTrackerConsent";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("consentStatus");
        Adapters.f.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.f22753a));
    }

    public final String toString() {
        return androidx.compose.ui.input.pointer.a.n("UpdateFoodTrackerConsentMutation(consentStatus=", ")", this.f22753a);
    }
}
