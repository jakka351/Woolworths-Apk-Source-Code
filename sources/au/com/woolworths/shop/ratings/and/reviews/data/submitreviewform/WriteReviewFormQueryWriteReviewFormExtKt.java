package au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform;

import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.ratings.and.reviews.WriteReviewFormQuery;
import au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.writereviewitems.ReviewInputItemBodyField;
import au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.writereviewitems.ReviewInputItemNameField;
import au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.writereviewitems.ReviewInputItemRating;
import au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.writereviewitems.ReviewInputItemTitleField;
import au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.writereviewitems.ReviewItemTitle;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ratings-and-reviews_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class WriteReviewFormQueryWriteReviewFormExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.writereviewitems.ReviewInputItemBodyField] */
    /* JADX WARN: Type inference failed for: r10v4, types: [au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.writereviewitems.ReviewInputItemTitleField] */
    /* JADX WARN: Type inference failed for: r5v10, types: [au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.ReviewFormSectionReviewInputs] */
    /* JADX WARN: Type inference failed for: r5v12, types: [au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.ReviewFormSectionTargetProduct] */
    /* JADX WARN: Type inference failed for: r8v10, types: [au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.writereviewitems.ReviewInputItemRating] */
    /* JADX WARN: Type inference failed for: r8v12, types: [au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.writereviewitems.ReviewItemTitle] */
    public static final WriteReviewFormData a(WriteReviewFormQuery.WriteReviewForm writeReviewForm) {
        ButtonStyleApiData buttonStyleApiData;
        ReviewInputItemNameField reviewInputItemNameField;
        ReviewInputItemNameField reviewInputItemBodyField;
        String str = writeReviewForm.f12701a;
        ArrayList arrayList = writeReviewForm.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            buttonStyleApiData = null;
            ReviewFormSectionTermsAndConditions reviewFormSectionTermsAndConditions = null;
            if (!it.hasNext()) {
                break;
            }
            WriteReviewFormQuery.Section section = (WriteReviewFormQuery.Section) it.next();
            WriteReviewFormQuery.OnWriteReviewFormTargetProduct onWriteReviewFormTargetProduct = section.b;
            if (onWriteReviewFormTargetProduct != null) {
                WriteReviewFormQuery.Product product = onWriteReviewFormTargetProduct.f12696a;
                reviewFormSectionTermsAndConditions = new ReviewFormSectionTargetProduct(new ReviewsProductCardInfo(product.f12698a, product.b, product.c), onWriteReviewFormTargetProduct.b);
            } else {
                WriteReviewFormQuery.OnWriteReviewFormReview onWriteReviewFormReview = section.c;
                if (onWriteReviewFormReview != null) {
                    ArrayList<WriteReviewFormQuery.Item> arrayList3 = onWriteReviewFormReview.f12692a;
                    ArrayList arrayList4 = new ArrayList();
                    for (WriteReviewFormQuery.Item item : arrayList3) {
                        WriteReviewFormQuery.OnWriteReviewFormReviewItemTitle onWriteReviewFormReviewItemTitle = item.b;
                        if (onWriteReviewFormReviewItemTitle != null) {
                            reviewInputItemNameField = new ReviewItemTitle(onWriteReviewFormReviewItemTitle.f12694a);
                        } else {
                            WriteReviewFormQuery.OnWriteReviewFormRatings onWriteReviewFormRatings = item.c;
                            if (onWriteReviewFormRatings != null) {
                                reviewInputItemNameField = new ReviewInputItemRating(0, onWriteReviewFormRatings.f12691a, null);
                            } else {
                                WriteReviewFormQuery.OnWriteReviewFormReviewTitle onWriteReviewFormReviewTitle = item.d;
                                if (onWriteReviewFormReviewTitle != null) {
                                    reviewInputItemBodyField = new ReviewInputItemTitleField(onWriteReviewFormReviewTitle.f12695a, onWriteReviewFormReviewTitle.b, onWriteReviewFormReviewTitle.c, onWriteReviewFormReviewTitle.d, onWriteReviewFormReviewTitle.e, onWriteReviewFormReviewTitle.f, "", null, false);
                                } else {
                                    WriteReviewFormQuery.OnWriteReviewFormReviewBody onWriteReviewFormReviewBody = item.e;
                                    if (onWriteReviewFormReviewBody != null) {
                                        reviewInputItemBodyField = new ReviewInputItemBodyField(onWriteReviewFormReviewBody.f12693a, onWriteReviewFormReviewBody.b, onWriteReviewFormReviewBody.c, onWriteReviewFormReviewBody.d, onWriteReviewFormReviewBody.e, onWriteReviewFormReviewBody.f, "", null, false);
                                    } else {
                                        WriteReviewFormQuery.OnWriteReviewFormNameField onWriteReviewFormNameField = item.f;
                                        reviewInputItemNameField = onWriteReviewFormNameField != null ? new ReviewInputItemNameField(onWriteReviewFormNameField.f12690a, onWriteReviewFormNameField.b, onWriteReviewFormNameField.c, onWriteReviewFormNameField.d, onWriteReviewFormNameField.e, onWriteReviewFormNameField.f, "", null, false) : null;
                                    }
                                }
                                reviewInputItemNameField = reviewInputItemBodyField;
                            }
                        }
                        if (reviewInputItemNameField != null) {
                            arrayList4.add(reviewInputItemNameField);
                        }
                    }
                    reviewFormSectionTermsAndConditions = new ReviewFormSectionReviewInputs(arrayList4);
                } else {
                    WriteReviewFormQuery.OnWriteReviewFormTermsConditions onWriteReviewFormTermsConditions = section.d;
                    if (onWriteReviewFormTermsConditions != null) {
                        reviewFormSectionTermsAndConditions = new ReviewFormSectionTermsAndConditions(onWriteReviewFormTermsConditions.f12697a, onWriteReviewFormTermsConditions.b, false, false);
                    }
                }
            }
            if (reviewFormSectionTermsAndConditions != null) {
                arrayList2.add(reviewFormSectionTermsAndConditions);
            }
        }
        WriteReviewFormQuery.SubmitButton submitButton = writeReviewForm.c;
        String str2 = submitButton.f12700a;
        ButtonStyle buttonStyle = submitButton.b;
        if (buttonStyle != null) {
            int iOrdinal = buttonStyle.ordinal();
            buttonStyleApiData = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? iOrdinal != 5 ? ButtonStyleApiData.d : ButtonStyleApiData.INSTOCK : ButtonStyleApiData.INFO : ButtonStyleApiData.DESTRUCTIVE : ButtonStyleApiData.TERTIARY : ButtonStyleApiData.SECONDARY : ButtonStyleApiData.PRIMARY;
        }
        return new WriteReviewFormData(str, arrayList2, new ButtonApiData(str2, null, buttonStyleApiData, submitButton.c, null, null, submitButton.d, null, null, 434, null), 0, false);
    }
}
