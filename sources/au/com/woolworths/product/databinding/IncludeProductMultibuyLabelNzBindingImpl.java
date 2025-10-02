package au.com.woolworths.product.databinding;

import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.ui.ProductMultiBuyLabelStyle;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;

/* loaded from: classes4.dex */
public class IncludeProductMultibuyLabelNzBindingImpl extends IncludeProductMultibuyLabelNzBinding {
    public long D;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (203 == i) {
            M((ProductCard) obj);
            return true;
        }
        if (151 == i) {
            L((ProductMultiBuyLabelStyle) obj);
            return true;
        }
        if (247 != i) {
            return false;
        }
        this.C = (Boolean) obj;
        synchronized (this) {
            this.D |= 4;
        }
        h(247);
        y();
        return true;
    }

    @Override // au.com.woolworths.product.databinding.IncludeProductMultibuyLabelNzBinding
    public final void L(ProductMultiBuyLabelStyle productMultiBuyLabelStyle) throws Throwable {
        this.B = productMultiBuyLabelStyle;
        synchronized (this) {
            this.D |= 2;
        }
        h(151);
        y();
    }

    @Override // au.com.woolworths.product.databinding.IncludeProductMultibuyLabelNzBinding
    public final void M(ProductCard productCard) throws Throwable {
        this.A = productCard;
        synchronized (this) {
            this.D |= 1;
        }
        h(DatastoreTestTrace.FirestoreV1Action.MATCHING_DOCUMENTS_FIELD_NUMBER);
        y();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0148  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.product.databinding.IncludeProductMultibuyLabelNzBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.D = 8L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
