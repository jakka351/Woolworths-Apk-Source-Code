package me.oriient.ipssdk.realtime.ips;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.api.models.IPSCoordinate;
import me.oriient.ipssdk.api.models.IPSHeading;
import me.oriient.ipssdk.api.models.IPSStartingPosition;
import me.oriient.ipssdk.realtime.utils.models.Position;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/UtilsOld;", "", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "coordinate", "Lorg/json/JSONArray;", "coordinateToJson", "(Lme/oriient/ipssdk/api/models/IPSCoordinate;)Lorg/json/JSONArray;", "Lme/oriient/ipssdk/api/models/IPSStartingPosition;", "p", "Lorg/json/JSONObject;", "startingPositionToJson", "(Lme/oriient/ipssdk/api/models/IPSStartingPosition;)Lorg/json/JSONObject;", "", "getDeviceDescription", "()Ljava/lang/String;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UtilsOld {

    @NotNull
    public static final UtilsOld INSTANCE = new UtilsOld();

    private UtilsOld() {
    }

    @JvmStatic
    @NotNull
    public static final JSONArray coordinateToJson(@NotNull IPSCoordinate coordinate) throws JSONException {
        Intrinsics.h(coordinate, "coordinate");
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(coordinate.getX());
            jSONArray.put(coordinate.getY());
            return jSONArray;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONArray;
        }
    }

    @JvmStatic
    @NotNull
    public static final String getDeviceDescription() {
        return Build.MANUFACTURER + ' ' + Build.MODEL;
    }

    @JvmStatic
    @NotNull
    public static final JSONObject startingPositionToJson(@NotNull IPSStartingPosition p) throws JSONException {
        Intrinsics.h(p, "p");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            Position.Keys keys = Position.Keys.X;
            jSONObject2.put(keys.getValue(), p.getX());
            Position.Keys keys2 = Position.Keys.Y;
            jSONObject2.put(keys2.getValue(), p.getY());
            jSONObject2.put(Position.Keys.LOCATION_ACCURACY.getValue(), p.getC());
            jSONObject.put(Position.Keys.LOCATION.getValue(), jSONObject2);
            if (p.getD() != null) {
                JSONObject jSONObject3 = new JSONObject();
                String value = keys.getValue();
                IPSHeading d = p.getD();
                Intrinsics.e(d);
                jSONObject3.put(value, d.getF26195a());
                String value2 = keys2.getValue();
                IPSHeading d2 = p.getD();
                Intrinsics.e(d2);
                jSONObject3.put(value2, d2.getB());
                jSONObject.put(Position.Keys.HEADING.getValue(), jSONObject3);
            }
            if (p instanceof Position) {
                jSONObject.put(Position.Keys.SOURCE.getValue(), Position.Values.LAST_KNOWN.getValue());
                return jSONObject;
            }
            jSONObject.put(Position.Keys.SOURCE.getValue(), Position.Values.EXTERNAL.getValue());
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
