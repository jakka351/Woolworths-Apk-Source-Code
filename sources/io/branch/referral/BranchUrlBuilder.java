package io.branch.referral;

import android.content.Context;
import io.branch.referral.BranchUrlBuilder;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes7.dex */
abstract class BranchUrlBuilder<T extends BranchUrlBuilder> {

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f23855a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public ArrayList h;
    public final Context j;
    public int g = 0;
    public final Branch i = Branch.i();

    public BranchUrlBuilder(Context context) {
        this.j = context.getApplicationContext();
    }
}
