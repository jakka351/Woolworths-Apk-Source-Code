package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import android.content.Context;
import android.widget.LinearLayout;
import au.com.woolworths.android.onesite.modules.checkout.common.PaymentBreakdownState;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.enums.UIStatus;
import au.com.woolworths.android.onesite.modules.mvp.BaseMainView;
import au.com.woolworths.android.onesite.modules.mvp.BasePresenter;
import au.com.woolworths.pay.sdk.web.CardCaptureView;
import io.reactivex.internal.operators.single.SingleObserveOn;
import java.net.URL;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/digitalpay/DigitalPayForOrderContract;", "", "View", "Presenter", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DigitalPayForOrderContract {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/digitalpay/DigitalPayForOrderContract$Presenter;", "Lau/com/woolworths/android/onesite/modules/mvp/BasePresenter;", "Lau/com/woolworths/android/onesite/modules/checkout/digitalpay/DigitalPayForOrderContract$View;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Presenter extends BasePresenter<View> {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/digitalpay/DigitalPayForOrderContract$View;", "Lau/com/woolworths/android/onesite/modules/mvp/BaseMainView;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface View extends BaseMainView {
        String A();

        void A0();

        void B2(boolean z);

        String B3();

        String B4();

        void C0(UIStatus uIStatus);

        void D1(String str);

        void D2(boolean z, boolean z2);

        void E();

        void E0(boolean z);

        void E3();

        String F();

        String F1();

        String F2();

        String G();

        void G0(String str);

        boolean H1();

        void H3(String str);

        String I0();

        void I3();

        void I4(PaymentBreakdownState paymentBreakdownState);

        String J0();

        void J2();

        void K0();

        void L();

        void L1();

        void M0(boolean z);

        void M1(String str);

        LinearLayout M2();

        String M3();

        String N0();

        void O(UIStatus uIStatus);

        void O2(UIStatus uIStatus);

        String P0();

        Context P3();

        void Q3();

        String R2();

        void R3(URL url);

        void S1();

        void S2();

        void T();

        void T1();

        String T2();

        void T3(boolean z);

        String U();

        boolean U0();

        void U1(boolean z);

        boolean U2();

        void U3(UIStatus uIStatus);

        void V();

        void V1(boolean z);

        String V3();

        void W(boolean z);

        void W0();

        String W1();

        void X(boolean z);

        void Y0();

        void Y1();

        String Y2();

        void Z();

        String Z0();

        String Z1();

        boolean Z2();

        void Z3(long j);

        void a0(boolean z);

        void a1(boolean z);

        String a2();

        String a3();

        void a4();

        String b0();

        void b3();

        void b4();

        void c0(boolean z);

        String c1();

        String c2();

        String c3();

        void d0();

        void d1();

        void d2();

        String d4();

        String e1();

        void e2(String str, boolean z);

        void e4(boolean z, boolean z2, boolean z3);

        void f1();

        void f2(String str);

        String f4();

        void g1();

        void g2();

        void g3(UIStatus uIStatus);

        void g4(String str, boolean z);

        void h0();

        void h1(boolean z, boolean z2);

        String i3();

        String j2();

        void j3();

        void k0(String str);

        void l2();

        String l3();

        String l4();

        String m1();

        void n0();

        void n1();

        String n3();

        void n4();

        SingleObserveOn o3();

        void p0(CardCaptureView cardCaptureView);

        void p3(String str);

        void p4(boolean z, boolean z2);

        String q3();

        void r3();

        void r4();

        String s0();

        void s1();

        void t1();

        void t2(String str, boolean z);

        void u0(String str, boolean z);

        String u3();

        void u4();

        void v0(String str, boolean z, boolean z2);

        String v1();

        String v3();

        void v4();

        void x2();

        String y1();

        String y4();

        void z();

        String z1();

        void z2(String str);

        void z4();
    }
}
