package au.com.woolworths.base.shopapp.ui.infosection;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.camera.camera2.interop.e;
import androidx.camera.core.impl.b;
import androidx.databinding.ViewDataBinding;
import androidx.work.impl.utils.c;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.extensions.SpannableStringExtKt;
import au.com.woolworths.base.shopapp.ItemInfoSectionFooterBindingModel_;
import au.com.woolworths.base.shopapp.ItemInfoSectionItemBindingModel_;
import au.com.woolworths.base.shopapp.ItemInfoSectionTitleBindingModel_;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.base.shopapp.data.models.InfoSectionFooter;
import au.com.woolworths.base.shopapp.data.models.InfoSectionItem;
import au.com.woolworths.base.shopapp.databinding.EpoxyItemInfoSectionFooterBinding;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.TypedEpoxyController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lau/com/woolworths/base/shopapp/ui/infosection/InfoSectionEpoxyController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "Lau/com/woolworths/base/shopapp/data/models/InfoSection;", "footerListener", "Lau/com/woolworths/base/shopapp/ui/infosection/InfoSectionFooterListener;", "<init>", "(Lau/com/woolworths/base/shopapp/ui/infosection/InfoSectionFooterListener;)V", "buildModels", "", "data", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InfoSectionEpoxyController extends TypedEpoxyController<InfoSection> {

    @Nullable
    private final InfoSectionFooterListener footerListener;

    public InfoSectionEpoxyController() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$8$lambda$7$lambda$6$lambda$5(InfoSectionFooter infoSectionFooter, InfoSectionEpoxyController infoSectionEpoxyController, ItemInfoSectionFooterBindingModel_ itemInfoSectionFooterBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        ViewDataBinding viewDataBinding = dataBindingHolder.f13309a;
        Intrinsics.f(viewDataBinding, "null cannot be cast to non-null type au.com.woolworths.base.shopapp.databinding.EpoxyItemInfoSectionFooterBinding");
        EpoxyItemInfoSectionFooterBinding epoxyItemInfoSectionFooterBinding = (EpoxyItemInfoSectionFooterBinding) viewDataBinding;
        TextView textView = epoxyItemInfoSectionFooterBinding.y;
        Intrinsics.h(infoSectionFooter, "<this>");
        SpannableString spannableString = new SpannableString(b.o(infoSectionFooter.getTitle(), " ", infoSectionFooter.getSubtitle()));
        SpannableStringExtKt.a(spannableString, infoSectionFooter.getSubtitle(), null, new c(3, infoSectionEpoxyController, epoxyItemInfoSectionFooterBinding, infoSectionFooter));
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildModels$lambda$8$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3(InfoSectionEpoxyController infoSectionEpoxyController, EpoxyItemInfoSectionFooterBinding epoxyItemInfoSectionFooterBinding, InfoSectionFooter infoSectionFooter) {
        InfoSectionFooterListener infoSectionFooterListener = infoSectionEpoxyController.footerListener;
        if (infoSectionFooterListener != null) {
            infoSectionFooterListener.g0();
        }
        Context context = epoxyItemInfoSectionFooterBinding.y.getContext();
        Intrinsics.g(context, "getContext(...)");
        ContextExtKt.j(context, infoSectionFooter.getLinkUrl(), null, null, null, 62);
        return Unit.f24250a;
    }

    public /* synthetic */ InfoSectionEpoxyController(InfoSectionFooterListener infoSectionFooterListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : infoSectionFooterListener);
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@Nullable InfoSection data) {
        if (data != null) {
            ItemInfoSectionTitleBindingModel_ itemInfoSectionTitleBindingModel_ = new ItemInfoSectionTitleBindingModel_();
            itemInfoSectionTitleBindingModel_.M("title_" + data.hashCode());
            String strC = data.getTitle();
            itemInfoSectionTitleBindingModel_.t();
            itemInfoSectionTitleBindingModel_.n = strC;
            add(itemInfoSectionTitleBindingModel_);
            for (InfoSectionItem infoSectionItem : data.getItems()) {
                ItemInfoSectionItemBindingModel_ itemInfoSectionItemBindingModel_ = new ItemInfoSectionItemBindingModel_();
                itemInfoSectionItemBindingModel_.M("item_" + infoSectionItem.hashCode());
                itemInfoSectionItemBindingModel_.t();
                itemInfoSectionItemBindingModel_.n = infoSectionItem;
                add(itemInfoSectionItemBindingModel_);
            }
            InfoSectionFooter infoSectionFooterA = data.getFooter();
            if (infoSectionFooterA != null) {
                ItemInfoSectionFooterBindingModel_ itemInfoSectionFooterBindingModel_ = new ItemInfoSectionFooterBindingModel_();
                itemInfoSectionFooterBindingModel_.M("footer_" + infoSectionFooterA.hashCode());
                e eVar = new e(15, infoSectionFooterA, this);
                itemInfoSectionFooterBindingModel_.t();
                itemInfoSectionFooterBindingModel_.n = eVar;
                add(itemInfoSectionFooterBindingModel_);
            }
        }
    }

    public InfoSectionEpoxyController(@Nullable InfoSectionFooterListener infoSectionFooterListener) {
        this.footerListener = infoSectionFooterListener;
    }
}
