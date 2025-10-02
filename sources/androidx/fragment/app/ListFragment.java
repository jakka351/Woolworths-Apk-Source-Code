package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes2.dex */
public class ListFragment extends Fragment {
    public final Handler d = new Handler();
    public final Runnable e = new Runnable() { // from class: androidx.fragment.app.ListFragment.1
        @Override // java.lang.Runnable
        public final void run() {
            ListView listView = ListFragment.this.g;
            listView.focusableViewAvailable(listView);
        }
    };
    public final AdapterView.OnItemClickListener f = new AnonymousClass2();
    public ListView g;
    public View h;
    public View i;
    public View j;
    public boolean k;

    /* renamed from: androidx.fragment.app.ListFragment$2, reason: invalid class name */
    public class AnonymousClass2 implements AdapterView.OnItemClickListener {
        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
            Callback.j(view);
            try {
            } finally {
                Callback.k();
            }
        }
    }

    public final void E1() {
        if (this.g != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.g = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(16711681);
            if (textView == null) {
                this.h = view.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.i = view.findViewById(16711682);
            this.j = view.findViewById(16711683);
            View viewFindViewById = view.findViewById(R.id.list);
            if (!(viewFindViewById instanceof ListView)) {
                if (viewFindViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) viewFindViewById;
            this.g = listView;
            View view2 = this.h;
            if (view2 != null) {
                listView.setEmptyView(view2);
            }
        }
        this.k = true;
        this.g.setOnItemClickListener(this.f);
        if (this.i != null) {
            E1();
            View view3 = this.i;
            if (view3 == null) {
                throw new IllegalStateException("Can't be used with a custom content view");
            }
            if (this.k) {
                this.k = false;
                view3.clearAnimation();
                this.j.clearAnimation();
                this.i.setVisibility(0);
                this.j.setVisibility(8);
            }
        }
        this.d.post(this.e);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context contextRequireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(contextRequireContext);
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(contextRequireContext, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(contextRequireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(contextRequireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(contextRequireContext);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.d.removeCallbacks(this.e);
        this.g = null;
        this.k = false;
        this.j = null;
        this.i = null;
        this.h = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        E1();
    }
}
