package io.branch.referral;

import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.dynatrace.android.callback.Callback;
import io.branch.referral.Branch;

/* loaded from: classes7.dex */
class ShareLinkManager {

    /* renamed from: io.branch.referral.ShareLinkManager$1, reason: invalid class name */
    class AnonymousClass1 implements AdapterView.OnItemClickListener {
        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
            Callback.j(view);
            try {
                if (view == null) {
                    Callback.k();
                } else {
                    if (view.getTag() instanceof MoreShareItem) {
                        throw null;
                    }
                    if (view.getTag() instanceof ResolveInfo) {
                        throw null;
                    }
                    Callback.k();
                }
            } catch (Throwable th) {
                Callback.k();
                throw th;
            }
        }
    }

    /* renamed from: io.branch.referral.ShareLinkManager$2, reason: invalid class name */
    class AnonymousClass2 implements DialogInterface.OnDismissListener {
        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            throw null;
        }
    }

    /* renamed from: io.branch.referral.ShareLinkManager$3, reason: invalid class name */
    class AnonymousClass3 implements DialogInterface.OnKeyListener {
        @Override // android.content.DialogInterface.OnKeyListener
        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 1) {
                return false;
            }
            if (i == 4 || i == 23 || i == 66 || i == 19 || i == 20) {
                throw null;
            }
            return false;
        }
    }

    /* renamed from: io.branch.referral.ShareLinkManager$4, reason: invalid class name */
    class AnonymousClass4 implements Branch.BranchLinkCreateListener {
        @Override // io.branch.referral.Branch.BranchLinkCreateListener
        public final void e(String str, BranchError branchError) {
            throw null;
        }
    }

    public class ChooserArrayAdapter extends BaseAdapter {
        @Override // android.widget.Adapter
        public final int getCount() {
            throw null;
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            throw null;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                throw null;
            }
            throw null;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean isEnabled(int i) {
            throw null;
        }
    }

    public class CopyLinkItem extends ResolveInfo {
        @Override // android.content.pm.ResolveInfo
        public final Drawable loadIcon(PackageManager packageManager) {
            throw null;
        }

        @Override // android.content.pm.ResolveInfo
        public final CharSequence loadLabel(PackageManager packageManager) {
            throw null;
        }
    }

    public class MoreShareItem extends ResolveInfo {
        @Override // android.content.pm.ResolveInfo
        public final Drawable loadIcon(PackageManager packageManager) {
            throw null;
        }

        @Override // android.content.pm.ResolveInfo
        public final CharSequence loadLabel(PackageManager packageManager) {
            throw null;
        }
    }

    public class ShareItemView extends TextView {
    }
}
