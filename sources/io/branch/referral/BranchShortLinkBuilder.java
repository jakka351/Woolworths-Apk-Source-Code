package io.branch.referral;

import android.content.Context;
import androidx.compose.runtime.snapshots.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class BranchShortLinkBuilder extends BranchUrlBuilder<BranchShortLinkBuilder> {
    public BranchShortLinkBuilder(Context context) {
        super(context);
    }

    public final BranchShortLinkBuilder a(Object obj, String str) {
        try {
            if (this.f23855a == null) {
                this.f23855a = new JSONObject();
            }
            this.f23855a.put(str, obj);
            return this;
        } catch (JSONException e) {
            c.z(e, new StringBuilder("Caught JSONException"));
            return this;
        }
    }

    public final BranchShortLinkBuilder b(ArrayList arrayList) {
        if (this.h == null) {
            this.h = new ArrayList();
        }
        this.h.addAll(arrayList);
        return this;
    }

    public final void c(a aVar) {
        Branch branch = this.i;
        if (branch == null) {
            new BranchError("session has not been initialized", -101);
            BranchLogger.f("Warning: User session has not been initialized");
            return;
        }
        branch.d(new ServerRequestCreateUrl(this.j, this.f, this.g, this.h, this.b, this.c, this.d, this.e, this.f23855a, aVar, true));
    }

    public final String d() {
        Branch branch = this.i;
        if (branch == null) {
            return null;
        }
        return branch.d(new ServerRequestCreateUrl(this.j, this.f, this.g, this.h, this.b, this.c, this.d, this.e, this.f23855a, null, false));
    }

    public final void e(String str) {
        this.f = str;
    }

    public final void f(String str) {
        this.e = str;
    }

    public final void g(String str) {
        this.b = str;
    }

    public final void h(int i) {
        this.g = i;
    }

    public final void i(String str) {
        this.c = str;
    }

    public final void j(String str) {
        this.d = str;
    }
}
