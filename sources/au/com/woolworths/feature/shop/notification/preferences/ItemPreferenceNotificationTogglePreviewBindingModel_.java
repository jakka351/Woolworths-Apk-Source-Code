package au.com.woolworths.feature.shop.notification.preferences;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.notification.preferences.models.PreviewContentData;
import au.com.woolworths.feature.shop.notification.preferences.models.PreviewImageItemData;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemPreferenceNotificationTogglePreviewBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemPreferenceNotificationTogglePreviewBindingModelBuilder {
    public PreviewContentData n;
    public PreviewImageItemData o;

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel, com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final void A(Object obj) {
        super.A((DataBindingEpoxyModel.DataBindingHolder) obj);
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public final /* bridge */ /* synthetic */ void G(EpoxyHolder epoxyHolder) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: H */
    public final /* bridge */ /* synthetic */ void x(int i, EpoxyHolder epoxyHolder) {
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel, com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: I */
    public final void A(EpoxyHolder epoxyHolder) {
        super.A((DataBindingEpoxyModel.DataBindingHolder) epoxyHolder);
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void J(ViewDataBinding viewDataBinding) {
        if (!viewDataBinding.G(200, this.n)) {
            throw new IllegalStateException("The attribute previewContent was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(104, this.o)) {
            throw new IllegalStateException("The attribute imageItem was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemPreferenceNotificationTogglePreviewBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemPreferenceNotificationTogglePreviewBindingModel_ itemPreferenceNotificationTogglePreviewBindingModel_ = (ItemPreferenceNotificationTogglePreviewBindingModel_) epoxyModel;
        PreviewContentData previewContentData = this.n;
        if (previewContentData == null ? itemPreferenceNotificationTogglePreviewBindingModel_.n != null : !previewContentData.equals(itemPreferenceNotificationTogglePreviewBindingModel_.n)) {
            viewDataBinding.G(200, this.n);
        }
        PreviewImageItemData previewImageItemData = this.o;
        PreviewImageItemData previewImageItemData2 = itemPreferenceNotificationTogglePreviewBindingModel_.o;
        if (previewImageItemData != null) {
            if (previewImageItemData.equals(previewImageItemData2)) {
                return;
            }
        } else if (previewImageItemData2 == null) {
            return;
        }
        viewDataBinding.G(104, this.o);
    }

    public final ItemPreferenceNotificationTogglePreviewBindingModel_ M(String str) {
        super.p(str);
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void a(int i, Object obj) {
        B(i, "The model was changed during the bind call.");
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void b(int i, Object obj) {
        B(i, "The model was changed between being added to the controller and being bound.");
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void c(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        d(epoxyController);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ItemPreferenceNotificationTogglePreviewBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemPreferenceNotificationTogglePreviewBindingModel_ itemPreferenceNotificationTogglePreviewBindingModel_ = (ItemPreferenceNotificationTogglePreviewBindingModel_) obj;
        PreviewContentData previewContentData = this.n;
        if (previewContentData == null ? itemPreferenceNotificationTogglePreviewBindingModel_.n != null : !previewContentData.equals(itemPreferenceNotificationTogglePreviewBindingModel_.n)) {
            return false;
        }
        PreviewImageItemData previewImageItemData = this.o;
        PreviewImageItemData previewImageItemData2 = itemPreferenceNotificationTogglePreviewBindingModel_.o;
        return previewImageItemData == null ? previewImageItemData2 == null : previewImageItemData.equals(previewImageItemData2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        PreviewContentData previewContentData = this.n;
        int iHashCode2 = (iHashCode + (previewContentData != null ? previewContentData.hashCode() : 0)) * 31;
        PreviewImageItemData previewImageItemData = this.o;
        return iHashCode2 + (previewImageItemData != null ? previewImageItemData.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_preference_notification_toggle_preview;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemPreferenceNotificationTogglePreviewBindingModel_{previewContent=" + this.n + ", imageItem=" + this.o + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
