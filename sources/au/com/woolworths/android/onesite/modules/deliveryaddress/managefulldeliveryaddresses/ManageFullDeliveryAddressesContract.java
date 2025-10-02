package au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses;

import au.com.woolworths.android.onesite.modules.mvp.BasePresenter;
import au.com.woolworths.android.onesite.modules.mvp.BaseView;
import au.com.woolworths.android.onesite.modules.mvp.BaseViewHolder;

/* loaded from: classes3.dex */
public interface ManageFullDeliveryAddressesContract {

    public interface Presenter extends BasePresenter<View> {
        int b();

        void c(ManageFullDeliveryAddressesActivity manageFullDeliveryAddressesActivity, boolean z, boolean z2);

        void d();

        void e(int i);

        void f(int i);

        long g(int i);

        void h(int i, PreviouslyUsedAddressesViewHolder previouslyUsedAddressesViewHolder);
    }

    public interface View extends BaseView {
        void J3();

        void K1();

        String R0();

        String V0();

        void W2(String str);

        String e0();

        void e3(boolean z, boolean z2);

        void f3(int i);

        void k2();

        void o4(String str);

        void p1();

        void r0();

        void s2();

        void u();

        void y();

        String y2();

        void z3(String str);
    }

    public interface ViewHolder extends BaseViewHolder {
    }
}
