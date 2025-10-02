package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.b0;
import com.medallia.digital.mobilesdk.j2;
import com.medallia.digital.mobilesdk.m6;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes.dex */
class l2 {

    /* renamed from: a, reason: collision with root package name */
    private final j2 f16576a;
    private final n2 b;
    protected boolean c;
    protected ArrayList<ResourceContract> d = new ArrayList<>();
    private long e;

    public class a implements n6<p7> {
        public a() {
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) throws JSONException {
            l2 l2Var = l2.this;
            l2Var.c = false;
            l2Var.a(l2Var.f16576a);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(p7 p7Var) throws JSONException {
            l2 l2Var = l2.this;
            l2Var.c = false;
            l2Var.f16576a.c(p7Var.a());
            l2 l2Var2 = l2.this;
            l2Var2.a(l2Var2.f16576a);
        }
    }

    /* loaded from: classes6.dex */
    public class c implements m6.b {
        public c() {
        }

        @Override // com.medallia.digital.mobilesdk.m6.b
        public void a(ResourceContract resourceContract) throws JSONException {
            l2.this.d.remove(resourceContract);
            int i = 0;
            while (true) {
                if (i >= l2.this.f16576a.f().size()) {
                    break;
                }
                if (l2.this.f16576a.f().get(i).getRemoteUrl().equals(resourceContract.getRemoteUrl())) {
                    l2.this.f16576a.f().set(i, resourceContract);
                    break;
                }
                i++;
            }
            l2 l2Var = l2.this;
            l2Var.a(l2Var.f16576a);
        }

        @Override // com.medallia.digital.mobilesdk.m6.b
        public void b(ResourceContract resourceContract) throws JSONException {
            l2.this.d.remove(resourceContract);
            l2.this.f16576a.a(j2.a.FAILED);
            l2 l2Var = l2.this;
            l2Var.a(l2Var.f16576a);
        }
    }

    public l2(j2 j2Var, n2 n2Var) {
        this.f16576a = j2Var;
        this.b = n2Var;
    }

    private void d() throws JSONException {
        this.e = System.currentTimeMillis();
        a4.b("execute form: " + this.f16576a.getFormId());
        if (this.f16576a.c() == j2.a.AVAILABLE) {
            n2 n2Var = this.b;
            if (n2Var != null) {
                n2Var.a(this.f16576a);
                return;
            }
            return;
        }
        this.f16576a.a(j2.a.IN_PROGRESS);
        p7 p7Var = (p7) f1.a().b(b0.a.Template, this.f16576a.h());
        boolean z = false;
        boolean z2 = (p7Var != null && this.f16576a.h().equals(p7Var.b()) && this.f16576a.g().equals(p7Var.a()) && this.f16576a.n()) ? false : true;
        if (!TextUtils.isEmpty(this.f16576a.h()) && z2) {
            z = true;
        }
        this.c = z;
        if (b() || z2) {
            a(new a());
        } else {
            a(this.f16576a);
        }
    }

    public j2 a(SDKConfigurationFormContract sDKConfigurationFormContract) {
        if (sDKConfigurationFormContract == null) {
            return null;
        }
        return (j2) f1.a().b(b0.a.FormData, sDKConfigurationFormContract.getFormId());
    }

    public boolean b() {
        if (this.f16576a.f() == null || this.f16576a.f().isEmpty()) {
            return false;
        }
        for (ResourceContract resourceContract : this.f16576a.f()) {
            resourceContract.setFormId(this.f16576a.getFormId());
            this.d.add(resourceContract);
        }
        if (!this.d.isEmpty()) {
            a(this.d);
        }
        a4.b("Resources downloading finished for form: " + this.f16576a.getFormId());
        return true;
    }

    public boolean c() {
        return this.c || !this.d.isEmpty();
    }

    public void a() throws JSONException {
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(j2 j2Var) throws JSONException {
        if (c()) {
            return;
        }
        if (j2Var.c() != j2.a.FAILED) {
            j2Var.a(j2.a.AVAILABLE);
        }
        f1.a().c(j2Var);
        n2 n2Var = this.b;
        if (n2Var != null) {
            n2Var.a(j2Var);
        }
        a4.b("Form: " + j2Var.getFormId() + " was preloaded");
        AnalyticsBridge.getInstance().reportPreloadMechanismEvent(this.e, System.currentTimeMillis(), j2Var.getFormId(), j2Var.c());
    }

    public class b implements n6<File> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16578a;
        final /* synthetic */ n6 b;

        public b(String str, n6 n6Var) {
            this.f16578a = str;
            this.b = n6Var;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            a4.b(YU.a.o(new StringBuilder(), this.f16578a, " download failed"));
            l2.this.f16576a.a(j2.a.FAILED);
            this.b.a(h4Var);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(File file) {
            if (file != null) {
                a4.b(YU.a.o(new StringBuilder(), this.f16578a, " downloaded download complete"));
                p7 p7Var = new p7(file.getAbsolutePath(), this.f16578a);
                f1.a().b(p7Var);
                this.b.a((n6) p7Var);
                return;
            }
            a4.b(YU.a.o(new StringBuilder(), this.f16578a, " download failed"));
            l2.this.f16576a.a(j2.a.FAILED);
            this.b.a((h4) null);
        }
    }

    public void a(n6<p7> n6Var) {
        String templateDebugRemoteUrl = this.f16576a.n() ? this.f16576a.getTemplateDebugRemoteUrl() : this.f16576a.h();
        if (this.f16576a.n()) {
            f1.a().a(b0.a.Template, this.f16576a.h());
        } else {
            f1.a().a(b0.a.Template, this.f16576a.getTemplateDebugRemoteUrl());
        }
        p7 p7Var = (p7) f1.a().b(b0.a.Template, templateDebugRemoteUrl);
        if (p7Var != null) {
            n6Var.a((n6<p7>) p7Var);
        } else {
            s4.f().a(templateDebugRemoteUrl, this.f16576a.g(), new b(templateDebugRemoteUrl, n6Var));
        }
    }

    public void a(List<ResourceContract> list) {
        new m6(list, new c());
    }
}
