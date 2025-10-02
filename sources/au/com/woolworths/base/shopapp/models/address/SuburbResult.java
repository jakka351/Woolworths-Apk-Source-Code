package au.com.woolworths.base.shopapp.models.address;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;

/* loaded from: classes3.dex */
public class SuburbResult {

    @SerializedName("suburbs")
    private List<Suburb> suburbs;

    public static class Suburb {

        @SerializedName("id")
        private int id;

        @SerializedName("postcode")
        private String postcode;

        @SerializedName(TextBundle.TEXT_ENTRY)
        private String text;

        public Suburb(String str, String str2, String str3) {
            this.id = Integer.parseInt(str);
            this.text = str2;
            this.postcode = str3;
        }

        public final int a() {
            return this.id;
        }

        public final String b() {
            return this.text;
        }

        public final void c(String str) {
            this.postcode = str;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof Suburb)) {
                Suburb suburb = (Suburb) obj;
                if (suburb.toString().equals(toString()) && suburb.id == this.id) {
                    return true;
                }
            }
            return false;
        }

        public final String toString() {
            return this.text + " - " + this.postcode;
        }
    }

    public final List a() {
        return this.suburbs;
    }

    public final void b(ArrayList arrayList) {
        this.suburbs = arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuburbResult{size:");
        List<Suburb> list = this.suburbs;
        if (list == null || list.isEmpty()) {
            sb.append("0");
        } else {
            sb.append(String.format("%d, [%s", Integer.valueOf(this.suburbs.size()), this.suburbs.get(0).toString()));
            if (this.suburbs.size() > 1) {
                sb.append(",...");
            }
            sb.append("]");
        }
        sb.append("}");
        return sb.toString();
    }
}
