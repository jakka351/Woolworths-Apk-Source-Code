package com.woolworths.shop.homepage;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.homepage.adapter.DismissBottomSheetMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/homepage/DismissBottomSheetMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/shop/homepage/DismissBottomSheetMutation$Data;", "Data", "DismissBottomSheet", "Companion", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DismissBottomSheetMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f22776a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/homepage/DismissBottomSheetMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/DismissBottomSheetMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final DismissBottomSheet f22777a;

        public Data(DismissBottomSheet dismissBottomSheet) {
            this.f22777a = dismissBottomSheet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f22777a, ((Data) obj).f22777a);
        }

        public final int hashCode() {
            DismissBottomSheet dismissBottomSheet = this.f22777a;
            if (dismissBottomSheet == null) {
                return 0;
            }
            return dismissBottomSheet.hashCode();
        }

        public final String toString() {
            return "Data(dismissBottomSheet=" + this.f22777a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/DismissBottomSheetMutation$DismissBottomSheet;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DismissBottomSheet {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f22778a;

        public DismissBottomSheet(Boolean bool) {
            this.f22778a = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DismissBottomSheet) && Intrinsics.c(this.f22778a, ((DismissBottomSheet) obj).f22778a);
        }

        public final int hashCode() {
            Boolean bool = this.f22778a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            return a.k(this.f22778a, "DismissBottomSheet(_excluded=", ")");
        }
    }

    public DismissBottomSheetMutation(String str) {
        this.f22776a = str;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(DismissBottomSheetMutation_ResponseAdapter.Data.f23000a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation DismissBottomSheet($id: ID!) { dismissBottomSheet(id: $id) { _excluded: _ } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DismissBottomSheetMutation) && Intrinsics.c(this.f22776a, ((DismissBottomSheetMutation) obj).f22776a);
    }

    public final int hashCode() {
        return this.f22776a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "66bbf73c400a60f62b9bf99d3d28c7408e9a4f649059c4fdfac530e13d7caa7a";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "DismissBottomSheet";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("id");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f22776a);
    }

    public final String toString() {
        return YU.a.h("DismissBottomSheetMutation(id=", this.f22776a, ")");
    }
}
