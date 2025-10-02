package au.com.woolworths.shop.ratings.and.reviews;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.WriteReviewFormInput;
import au.com.woolworths.shop.graphql.type.adapter.WriteReviewFormInput_InputAdapter;
import au.com.woolworths.shop.ratings.and.reviews.adapter.WriteReviewFormQuery_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$Data;", "Data", "WriteReviewForm", "Section", "OnWriteReviewFormTargetProduct", "Product", "OnWriteReviewFormReview", "Item", "OnWriteReviewFormReviewItemTitle", "OnWriteReviewFormRatings", "OnWriteReviewFormReviewTitle", "OnWriteReviewFormReviewBody", "OnWriteReviewFormNameField", "OnWriteReviewFormTermsConditions", "SubmitButton", "Companion", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class WriteReviewFormQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final WriteReviewFormInput f12687a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final WriteReviewForm f12688a;

        public Data(WriteReviewForm writeReviewForm) {
            this.f12688a = writeReviewForm;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f12688a, ((Data) obj).f12688a);
        }

        public final int hashCode() {
            return this.f12688a.hashCode();
        }

        public final String toString() {
            return "Data(writeReviewForm=" + this.f12688a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$Item;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f12689a;
        public final OnWriteReviewFormReviewItemTitle b;
        public final OnWriteReviewFormRatings c;
        public final OnWriteReviewFormReviewTitle d;
        public final OnWriteReviewFormReviewBody e;
        public final OnWriteReviewFormNameField f;

        public Item(String __typename, OnWriteReviewFormReviewItemTitle onWriteReviewFormReviewItemTitle, OnWriteReviewFormRatings onWriteReviewFormRatings, OnWriteReviewFormReviewTitle onWriteReviewFormReviewTitle, OnWriteReviewFormReviewBody onWriteReviewFormReviewBody, OnWriteReviewFormNameField onWriteReviewFormNameField) {
            Intrinsics.h(__typename, "__typename");
            this.f12689a = __typename;
            this.b = onWriteReviewFormReviewItemTitle;
            this.c = onWriteReviewFormRatings;
            this.d = onWriteReviewFormReviewTitle;
            this.e = onWriteReviewFormReviewBody;
            this.f = onWriteReviewFormNameField;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f12689a, item.f12689a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c) && Intrinsics.c(this.d, item.d) && Intrinsics.c(this.e, item.e) && Intrinsics.c(this.f, item.f);
        }

        public final int hashCode() {
            int iHashCode = this.f12689a.hashCode() * 31;
            OnWriteReviewFormReviewItemTitle onWriteReviewFormReviewItemTitle = this.b;
            int iHashCode2 = (iHashCode + (onWriteReviewFormReviewItemTitle == null ? 0 : onWriteReviewFormReviewItemTitle.f12694a.hashCode())) * 31;
            OnWriteReviewFormRatings onWriteReviewFormRatings = this.c;
            int iHashCode3 = (iHashCode2 + (onWriteReviewFormRatings == null ? 0 : onWriteReviewFormRatings.f12691a.hashCode())) * 31;
            OnWriteReviewFormReviewTitle onWriteReviewFormReviewTitle = this.d;
            int iHashCode4 = (iHashCode3 + (onWriteReviewFormReviewTitle == null ? 0 : onWriteReviewFormReviewTitle.hashCode())) * 31;
            OnWriteReviewFormReviewBody onWriteReviewFormReviewBody = this.e;
            int iHashCode5 = (iHashCode4 + (onWriteReviewFormReviewBody == null ? 0 : onWriteReviewFormReviewBody.hashCode())) * 31;
            OnWriteReviewFormNameField onWriteReviewFormNameField = this.f;
            return iHashCode5 + (onWriteReviewFormNameField != null ? onWriteReviewFormNameField.hashCode() : 0);
        }

        public final String toString() {
            return "Item(__typename=" + this.f12689a + ", onWriteReviewFormReviewItemTitle=" + this.b + ", onWriteReviewFormRatings=" + this.c + ", onWriteReviewFormReviewTitle=" + this.d + ", onWriteReviewFormReviewBody=" + this.e + ", onWriteReviewFormNameField=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$OnWriteReviewFormNameField;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnWriteReviewFormNameField {

        /* renamed from: a, reason: collision with root package name */
        public final String f12690a;
        public final boolean b;
        public final Integer c;
        public final int d;
        public final String e;
        public final String f;

        public OnWriteReviewFormNameField(String str, boolean z, Integer num, int i, String str2, String str3) {
            this.f12690a = str;
            this.b = z;
            this.c = num;
            this.d = i;
            this.e = str2;
            this.f = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnWriteReviewFormNameField)) {
                return false;
            }
            OnWriteReviewFormNameField onWriteReviewFormNameField = (OnWriteReviewFormNameField) obj;
            return Intrinsics.c(this.f12690a, onWriteReviewFormNameField.f12690a) && this.b == onWriteReviewFormNameField.b && Intrinsics.c(this.c, onWriteReviewFormNameField.c) && this.d == onWriteReviewFormNameField.d && Intrinsics.c(this.e, onWriteReviewFormNameField.e) && Intrinsics.c(this.f, onWriteReviewFormNameField.f);
        }

        public final int hashCode() {
            int iE = b.e(this.f12690a.hashCode() * 31, 31, this.b);
            Integer num = this.c;
            int iA = b.a(this.d, (iE + (num == null ? 0 : num.hashCode())) * 31, 31);
            String str = this.e;
            int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbQ = a.q("OnWriteReviewFormNameField(label=", this.f12690a, ", isOptional=", ", minCharacterCount=", this.b);
            sbQ.append(this.c);
            sbQ.append(", maxCharacterCount=");
            sbQ.append(this.d);
            sbQ.append(", helpText=");
            return a.l(sbQ, this.e, ", placeholderText=", this.f, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$OnWriteReviewFormRatings;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnWriteReviewFormRatings {

        /* renamed from: a, reason: collision with root package name */
        public final String f12691a;

        public OnWriteReviewFormRatings(String str) {
            this.f12691a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnWriteReviewFormRatings) && Intrinsics.c(this.f12691a, ((OnWriteReviewFormRatings) obj).f12691a);
        }

        public final int hashCode() {
            return this.f12691a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnWriteReviewFormRatings(title=", this.f12691a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$OnWriteReviewFormReview;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnWriteReviewFormReview {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f12692a;

        public OnWriteReviewFormReview(ArrayList arrayList) {
            this.f12692a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnWriteReviewFormReview) && this.f12692a.equals(((OnWriteReviewFormReview) obj).f12692a);
        }

        public final int hashCode() {
            return this.f12692a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("OnWriteReviewFormReview(items=", ")", this.f12692a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$OnWriteReviewFormReviewBody;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnWriteReviewFormReviewBody {

        /* renamed from: a, reason: collision with root package name */
        public final String f12693a;
        public final boolean b;
        public final Integer c;
        public final int d;
        public final String e;
        public final String f;

        public OnWriteReviewFormReviewBody(String str, boolean z, Integer num, int i, String str2, String str3) {
            this.f12693a = str;
            this.b = z;
            this.c = num;
            this.d = i;
            this.e = str2;
            this.f = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnWriteReviewFormReviewBody)) {
                return false;
            }
            OnWriteReviewFormReviewBody onWriteReviewFormReviewBody = (OnWriteReviewFormReviewBody) obj;
            return Intrinsics.c(this.f12693a, onWriteReviewFormReviewBody.f12693a) && this.b == onWriteReviewFormReviewBody.b && Intrinsics.c(this.c, onWriteReviewFormReviewBody.c) && this.d == onWriteReviewFormReviewBody.d && Intrinsics.c(this.e, onWriteReviewFormReviewBody.e) && Intrinsics.c(this.f, onWriteReviewFormReviewBody.f);
        }

        public final int hashCode() {
            int iE = b.e(this.f12693a.hashCode() * 31, 31, this.b);
            Integer num = this.c;
            int iA = b.a(this.d, (iE + (num == null ? 0 : num.hashCode())) * 31, 31);
            String str = this.e;
            int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbQ = a.q("OnWriteReviewFormReviewBody(label=", this.f12693a, ", isOptional=", ", minCharacterCount=", this.b);
            sbQ.append(this.c);
            sbQ.append(", maxCharacterCount=");
            sbQ.append(this.d);
            sbQ.append(", helpText=");
            return a.l(sbQ, this.e, ", placeholderText=", this.f, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$OnWriteReviewFormReviewItemTitle;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnWriteReviewFormReviewItemTitle {

        /* renamed from: a, reason: collision with root package name */
        public final String f12694a;

        public OnWriteReviewFormReviewItemTitle(String str) {
            this.f12694a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnWriteReviewFormReviewItemTitle) && Intrinsics.c(this.f12694a, ((OnWriteReviewFormReviewItemTitle) obj).f12694a);
        }

        public final int hashCode() {
            return this.f12694a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnWriteReviewFormReviewItemTitle(title=", this.f12694a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$OnWriteReviewFormReviewTitle;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnWriteReviewFormReviewTitle {

        /* renamed from: a, reason: collision with root package name */
        public final String f12695a;
        public final boolean b;
        public final Integer c;
        public final int d;
        public final String e;
        public final String f;

        public OnWriteReviewFormReviewTitle(String str, boolean z, Integer num, int i, String str2, String str3) {
            this.f12695a = str;
            this.b = z;
            this.c = num;
            this.d = i;
            this.e = str2;
            this.f = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnWriteReviewFormReviewTitle)) {
                return false;
            }
            OnWriteReviewFormReviewTitle onWriteReviewFormReviewTitle = (OnWriteReviewFormReviewTitle) obj;
            return Intrinsics.c(this.f12695a, onWriteReviewFormReviewTitle.f12695a) && this.b == onWriteReviewFormReviewTitle.b && Intrinsics.c(this.c, onWriteReviewFormReviewTitle.c) && this.d == onWriteReviewFormReviewTitle.d && Intrinsics.c(this.e, onWriteReviewFormReviewTitle.e) && Intrinsics.c(this.f, onWriteReviewFormReviewTitle.f);
        }

        public final int hashCode() {
            int iE = b.e(this.f12695a.hashCode() * 31, 31, this.b);
            Integer num = this.c;
            int iA = b.a(this.d, (iE + (num == null ? 0 : num.hashCode())) * 31, 31);
            String str = this.e;
            int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbQ = a.q("OnWriteReviewFormReviewTitle(label=", this.f12695a, ", isOptional=", ", minCharacterCount=", this.b);
            sbQ.append(this.c);
            sbQ.append(", maxCharacterCount=");
            sbQ.append(this.d);
            sbQ.append(", helpText=");
            return a.l(sbQ, this.e, ", placeholderText=", this.f, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$OnWriteReviewFormTargetProduct;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnWriteReviewFormTargetProduct {

        /* renamed from: a, reason: collision with root package name */
        public final Product f12696a;
        public final String b;

        public OnWriteReviewFormTargetProduct(Product product, String str) {
            this.f12696a = product;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnWriteReviewFormTargetProduct)) {
                return false;
            }
            OnWriteReviewFormTargetProduct onWriteReviewFormTargetProduct = (OnWriteReviewFormTargetProduct) obj;
            return Intrinsics.c(this.f12696a, onWriteReviewFormTargetProduct.f12696a) && Intrinsics.c(this.b, onWriteReviewFormTargetProduct.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f12696a.hashCode() * 31);
        }

        public final String toString() {
            return "OnWriteReviewFormTargetProduct(product=" + this.f12696a + ", altText=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$OnWriteReviewFormTermsConditions;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnWriteReviewFormTermsConditions {

        /* renamed from: a, reason: collision with root package name */
        public final String f12697a;
        public final String b;

        public OnWriteReviewFormTermsConditions(String str, String str2) {
            this.f12697a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnWriteReviewFormTermsConditions)) {
                return false;
            }
            OnWriteReviewFormTermsConditions onWriteReviewFormTermsConditions = (OnWriteReviewFormTermsConditions) obj;
            return Intrinsics.c(this.f12697a, onWriteReviewFormTermsConditions.f12697a) && Intrinsics.c(this.b, onWriteReviewFormTermsConditions.b);
        }

        public final int hashCode() {
            String str = this.f12697a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return YU.a.j("OnWriteReviewFormTermsConditions(markdownText=", this.f12697a, ", additionalTermsText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$Product;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Product {

        /* renamed from: a, reason: collision with root package name */
        public final String f12698a;
        public final String b;
        public final String c;

        public Product(String str, String str2, String str3) {
            this.f12698a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return Intrinsics.c(this.f12698a, product.f12698a) && Intrinsics.c(this.b, product.b) && Intrinsics.c(this.c, product.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f12698a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return YU.a.o(YU.a.v("Product(productId=", this.f12698a, ", name=", this.b, ", productImage="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$Section;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Section {

        /* renamed from: a, reason: collision with root package name */
        public final String f12699a;
        public final OnWriteReviewFormTargetProduct b;
        public final OnWriteReviewFormReview c;
        public final OnWriteReviewFormTermsConditions d;

        public Section(String __typename, OnWriteReviewFormTargetProduct onWriteReviewFormTargetProduct, OnWriteReviewFormReview onWriteReviewFormReview, OnWriteReviewFormTermsConditions onWriteReviewFormTermsConditions) {
            Intrinsics.h(__typename, "__typename");
            this.f12699a = __typename;
            this.b = onWriteReviewFormTargetProduct;
            this.c = onWriteReviewFormReview;
            this.d = onWriteReviewFormTermsConditions;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            return Intrinsics.c(this.f12699a, section.f12699a) && Intrinsics.c(this.b, section.b) && Intrinsics.c(this.c, section.c) && Intrinsics.c(this.d, section.d);
        }

        public final int hashCode() {
            int iHashCode = this.f12699a.hashCode() * 31;
            OnWriteReviewFormTargetProduct onWriteReviewFormTargetProduct = this.b;
            int iHashCode2 = (iHashCode + (onWriteReviewFormTargetProduct == null ? 0 : onWriteReviewFormTargetProduct.hashCode())) * 31;
            OnWriteReviewFormReview onWriteReviewFormReview = this.c;
            int iHashCode3 = (iHashCode2 + (onWriteReviewFormReview == null ? 0 : onWriteReviewFormReview.f12692a.hashCode())) * 31;
            OnWriteReviewFormTermsConditions onWriteReviewFormTermsConditions = this.d;
            return iHashCode3 + (onWriteReviewFormTermsConditions != null ? onWriteReviewFormTermsConditions.hashCode() : 0);
        }

        public final String toString() {
            return "Section(__typename=" + this.f12699a + ", onWriteReviewFormTargetProduct=" + this.b + ", onWriteReviewFormReview=" + this.c + ", onWriteReviewFormTermsConditions=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$SubmitButton;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SubmitButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f12700a;
        public final ButtonStyle b;
        public final boolean c;
        public final String d;

        public SubmitButton(String str, String str2, ButtonStyle buttonStyle, boolean z) {
            this.f12700a = str;
            this.b = buttonStyle;
            this.c = z;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubmitButton)) {
                return false;
            }
            SubmitButton submitButton = (SubmitButton) obj;
            return Intrinsics.c(this.f12700a, submitButton.f12700a) && this.b == submitButton.b && this.c == submitButton.c && Intrinsics.c(this.d, submitButton.d);
        }

        public final int hashCode() {
            int iHashCode = this.f12700a.hashCode() * 31;
            ButtonStyle buttonStyle = this.b;
            int iE = b.e((iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31, 31, this.c);
            String str = this.d;
            return iE + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbQ = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.q("SubmitButton(label=", this.f12700a, ", style=", this.b, ", enabled=");
            sbQ.append(this.c);
            sbQ.append(", altText=");
            sbQ.append(this.d);
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$WriteReviewForm;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WriteReviewForm {

        /* renamed from: a, reason: collision with root package name */
        public final String f12701a;
        public final ArrayList b;
        public final SubmitButton c;

        public WriteReviewForm(String str, ArrayList arrayList, SubmitButton submitButton) {
            this.f12701a = str;
            this.b = arrayList;
            this.c = submitButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WriteReviewForm)) {
                return false;
            }
            WriteReviewForm writeReviewForm = (WriteReviewForm) obj;
            return this.f12701a.equals(writeReviewForm.f12701a) && this.b.equals(writeReviewForm.b) && this.c.equals(writeReviewForm.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + androidx.compose.ui.input.pointer.a.b(this.f12701a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbX = d.x("WriteReviewForm(pageTitle=", this.f12701a, ", sections=", ", submitButton=", this.b);
            sbX.append(this.c);
            sbX.append(")");
            return sbX.toString();
        }
    }

    public WriteReviewFormQuery(WriteReviewFormInput writeReviewFormInput) {
        this.f12687a = writeReviewFormInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(WriteReviewFormQuery_ResponseAdapter.Data.f12719a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query writeReviewForm($writeReviewFormInput: WriteReviewFormInput!) { writeReviewForm(writeReviewFormInput: $writeReviewFormInput) { pageTitle sections { __typename ... on WriteReviewFormTargetProduct { product { productId name productImage } altText } ... on WriteReviewFormReview { items { __typename ... on WriteReviewFormReviewItemTitle { title } ... on WriteReviewFormRatings { title } ... on WriteReviewFormReviewTitle { label isOptional minCharacterCount maxCharacterCount helpText placeholderText } ... on WriteReviewFormReviewBody { label isOptional minCharacterCount maxCharacterCount helpText placeholderText } ... on WriteReviewFormNameField { label isOptional minCharacterCount maxCharacterCount helpText placeholderText } } } ... on WriteReviewFormTermsConditions { markdownText additionalTermsText } } submitButton { label style enabled altText } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WriteReviewFormQuery) && Intrinsics.c(this.f12687a, ((WriteReviewFormQuery) obj).f12687a);
    }

    public final int hashCode() {
        return this.f12687a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "6759bfa19f2dd11e5dc4926a702e3abc7ad39c1f1043b658d413cc9c79a68f5c";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "writeReviewForm";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("writeReviewFormInput");
        Adapters.c(WriteReviewFormInput_InputAdapter.f12142a, false).toJson(jsonWriter, customScalarAdapters, this.f12687a);
    }

    public final String toString() {
        return "WriteReviewFormQuery(writeReviewFormInput=" + this.f12687a + ")";
    }
}
