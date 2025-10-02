package au.com.woolworths.feature.shop.catalogue.termsandconditions;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.catalogue.home.model.Term;
import com.airbnb.epoxy.TypedEpoxyController;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014¨\u0006\t"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/termsandconditions/TermsEpoxyController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "", "Lau/com/woolworths/feature/shop/catalogue/home/model/Term;", "<init>", "()V", "buildModels", "", "data", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TermsEpoxyController extends TypedEpoxyController<List<? extends Term>> {
    public static final int $stable = 8;

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends Term> list) {
        buildModels2((List<Term>) list);
    }

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(@Nullable List<Term> data) {
        if (data == null) {
            return;
        }
        int i = 0;
        for (Object obj : data) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            Term term = (Term) obj;
            TermEpoxyModel_ termEpoxyModel_ = new TermEpoxyModel_();
            termEpoxyModel_.r(Integer.valueOf(i));
            String str = term.d;
            termEpoxyModel_.t();
            termEpoxyModel_.n = str;
            String str2 = term.e;
            termEpoxyModel_.t();
            termEpoxyModel_.o = str2;
            add(termEpoxyModel_);
            i = i2;
        }
    }
}
