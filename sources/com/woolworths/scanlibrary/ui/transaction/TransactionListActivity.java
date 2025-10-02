package com.woolworths.scanlibrary.ui.transaction;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.ui.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.b;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.ViewReceiptFromTransactionHistoryTracking;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity;
import com.woolworths.scanlibrary.databinding.ActivityTransactionListBinding;
import com.woolworths.scanlibrary.di.user.UserScopedActivity;
import com.woolworths.scanlibrary.models.error.ApigeeErrorResponse;
import com.woolworths.scanlibrary.models.receipt.Receipt;
import com.woolworths.scanlibrary.models.transactions.Transaction;
import com.woolworths.scanlibrary.ui.receipt.ReceiptActivity;
import com.woolworths.scanlibrary.ui.transaction.TransactionListCategory;
import com.woolworths.scanlibrary.ui.transaction.TransactionListContract;
import com.woolworths.scanlibrary.ui.transaction.viewholders.TransactionGroupViewHolder;
import com.woolworths.scanlibrary.ui.transaction.viewholders.TransactionLineItemViewHolder;
import com.woolworths.scanlibrary.util.adapter.RecyclerAdapter;
import com.woolworths.scanlibrary.util.extensions.BigDecimalExtKt;
import com.woolworths.scanlibrary.util.extensions.DateExtKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/scanlibrary/ui/transaction/TransactionListActivity;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseActivity;", "Lcom/woolworths/scanlibrary/ui/transaction/TransactionListContract$Presenter;", "Lcom/woolworths/scanlibrary/ui/transaction/TransactionListContract$View;", "Lcom/woolworths/scanlibrary/di/user/UserScopedActivity;", "<init>", "()V", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TransactionListActivity extends DaggerBaseActivity<TransactionListContract.Presenter> implements TransactionListContract.View, UserScopedActivity {
    public static final /* synthetic */ int J = 0;
    public ActivityTransactionListBinding G;
    public ArrayList H = new ArrayList();
    public TransactionListActivity$getTransactionListView$1 I;

    @Override // com.woolworths.scanlibrary.ui.transaction.TransactionListContract.View
    public final void O3(Receipt receipt) {
        Intrinsics.h(receipt, "receipt");
        N4().b(new ViewReceiptFromTransactionHistoryTracking("View Receipt - Transaction History"));
        ReceiptActivity.Companion.a(this, receipt, 12);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final int R4() {
        return R.layout.activity_transaction_list;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.woolworths.scanlibrary.ui.transaction.TransactionListActivity$getTransactionListView$1] */
    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final void V4() {
        ActivityTransactionListBinding activityTransactionListBinding = (ActivityTransactionListBinding) DataBindingUtil.d(this, R.layout.activity_transaction_list);
        this.G = activityTransactionListBinding;
        if (activityTransactionListBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        Toolbar toolbar = activityTransactionListBinding.z.y;
        Intrinsics.g(toolbar, "toolbar");
        ViewExtKt.b(toolbar, new b(19));
        ActivityTransactionListBinding activityTransactionListBinding2 = this.G;
        if (activityTransactionListBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        RecyclerView transactionListView = activityTransactionListBinding2.A;
        Intrinsics.g(transactionListView, "transactionListView");
        ViewExtKt.a(transactionListView);
        ActivityTransactionListBinding activityTransactionListBinding3 = this.G;
        if (activityTransactionListBinding3 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        setSupportActionBar(activityTransactionListBinding3.z.y);
        ActivityTransactionListBinding activityTransactionListBinding4 = this.G;
        if (activityTransactionListBinding4 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityTransactionListBinding4.z.z.setText(getResources().getString(R.string.sng_nav_menu_transaction_history));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.u();
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.s(true);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        final ArrayList arrayList = this.H;
        this.I = new RecyclerAdapter<TransactionListCategory, RecyclerView.ViewHolder>(arrayList) { // from class: com.woolworths.scanlibrary.ui.transaction.TransactionListActivity$getTransactionListView$1
            @Override // com.woolworths.scanlibrary.util.adapter.RecyclerAdapter
            public final void G(RecyclerView.ViewHolder viewHolder, Object obj, int i) {
                String string;
                TransactionListCategory model = (TransactionListCategory) obj;
                Intrinsics.h(model, "model");
                if (!(viewHolder instanceof TransactionLineItemViewHolder)) {
                    if ((viewHolder instanceof TransactionGroupViewHolder) && (model instanceof TransactionListCategory.TransactionGroupHeader)) {
                        TransactionGroupViewHolder transactionGroupViewHolder = (TransactionGroupViewHolder) viewHolder;
                        TransactionListCategory.TransactionGroupHeader transactionGroupHeader = (TransactionListCategory.TransactionGroupHeader) model;
                        String str = transactionGroupHeader.b;
                        int i2 = transactionGroupHeader.c;
                        Context context = transactionGroupViewHolder.c;
                        transactionGroupViewHolder.f21358a.setText(str);
                        transactionGroupViewHolder.b.setText(i2 == 0 ? context.getString(R.string.sng_label_txn_recent) : i2 == 1 ? context.getString(R.string.sng_label_txn_last_month) : (2 > i2 || i2 >= 13) ? context.getString(R.string.sng_label_txn_years_ago, Integer.valueOf(i2 / 12)) : context.getString(R.string.sng_label_txn_months_ago, Integer.valueOf(i2)));
                        return;
                    }
                    return;
                }
                if (model instanceof TransactionListCategory.TransactionLineItem) {
                    TransactionLineItemViewHolder transactionLineItemViewHolder = (TransactionLineItemViewHolder) viewHolder;
                    View view = transactionLineItemViewHolder.f21359a;
                    Transaction transaction = ((TransactionListCategory.TransactionLineItem) model).b;
                    Context context2 = view.getContext();
                    transactionLineItemViewHolder.b.setText(DateExtKt.a("dd MMM, HH:mm", transaction.getTxnTime()));
                    transactionLineItemViewHolder.c.setText(transaction.getStoreName());
                    transactionLineItemViewHolder.d.setText(context2.getResources().getQuantityString(R.plurals.sng_label_cart_count, transaction.getTotalQuantity(), Integer.valueOf(transaction.getTotalQuantity())));
                    TextView textView = transactionLineItemViewHolder.e;
                    BigDecimal balanceDue = transaction.getBalanceDue();
                    if (balanceDue == null || (string = BigDecimalExtKt.a(balanceDue)) == null) {
                        string = context2.getString(R.string.sng_label_cart_amount, Double.valueOf(transaction.getTotalPrice()));
                        Intrinsics.g(string, "getString(...)");
                    }
                    textView.setText(string);
                    view.setOnClickListener(new a(25, this.j, model));
                }
            }

            @Override // com.woolworths.scanlibrary.util.adapter.RecyclerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
            public final int k(int i) {
                return ((TransactionListCategory) this.j.H.get(i)).f21357a;
            }

            @Override // com.woolworths.scanlibrary.util.adapter.RecyclerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
            public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
                if (i == 1) {
                    View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_transaction_item, viewGroup, false);
                    Intrinsics.e(viewInflate);
                    return new TransactionLineItemViewHolder(viewInflate);
                }
                View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_transaction_header, viewGroup, false);
                Intrinsics.e(viewInflate2);
                return new TransactionGroupViewHolder(viewInflate2);
            }
        };
        ActivityTransactionListBinding activityTransactionListBinding5 = this.G;
        if (activityTransactionListBinding5 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityTransactionListBinding5.A.setLayoutManager(linearLayoutManager);
        ActivityTransactionListBinding activityTransactionListBinding6 = this.G;
        if (activityTransactionListBinding6 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        RecyclerView recyclerView = activityTransactionListBinding6.A;
        TransactionListActivity$getTransactionListView$1 transactionListActivity$getTransactionListView$1 = this.I;
        if (transactionListActivity$getTransactionListView$1 == null) {
            Intrinsics.p("transactionListAdapter");
            throw null;
        }
        recyclerView.setAdapter(transactionListActivity$getTransactionListView$1);
        ((TransactionListContract.Presenter) S4()).q();
    }

    @Override // com.woolworths.scanlibrary.ui.transaction.TransactionListContract.View
    public final void X1(ArrayList arrayList) {
        this.H = arrayList;
        TransactionListActivity$getTransactionListView$1 transactionListActivity$getTransactionListView$1 = this.I;
        if (transactionListActivity$getTransactionListView$1 == null) {
            Intrinsics.p("transactionListAdapter");
            throw null;
        }
        transactionListActivity$getTransactionListView$1.H(arrayList);
        if (arrayList.isEmpty()) {
            ActivityTransactionListBinding activityTransactionListBinding = this.G;
            if (activityTransactionListBinding == null) {
                Intrinsics.p("viewBinding");
                throw null;
            }
            activityTransactionListBinding.A.setVisibility(8);
            ActivityTransactionListBinding activityTransactionListBinding2 = this.G;
            if (activityTransactionListBinding2 != null) {
                activityTransactionListBinding2.y.setVisibility(0);
                return;
            } else {
                Intrinsics.p("viewBinding");
                throw null;
            }
        }
        ActivityTransactionListBinding activityTransactionListBinding3 = this.G;
        if (activityTransactionListBinding3 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityTransactionListBinding3.A.setVisibility(0);
        ActivityTransactionListBinding activityTransactionListBinding4 = this.G;
        if (activityTransactionListBinding4 != null) {
            activityTransactionListBinding4.y.setVisibility(8);
        } else {
            Intrinsics.p("viewBinding");
            throw null;
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final boolean X4() {
        return false;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity, com.woolworths.scanlibrary.base.mvp.MvpView
    public final void n(int i, int i2, ApigeeErrorResponse apigeeErrorResponse, Function0 function0) {
        super.n(i, i2, apigeeErrorResponse, new c(this, 26));
    }
}
