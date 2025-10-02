package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class KeyFrames {
    public static final HashMap b;

    /* renamed from: a, reason: collision with root package name */
    public HashMap f2332a = new HashMap();

    static {
        HashMap map = new HashMap();
        b = map;
        try {
            map.put("KeyAttribute", KeyAttributes.class.getConstructor(null));
            map.put("KeyPosition", KeyPosition.class.getConstructor(null));
            map.put("KeyCycle", KeyCycle.class.getConstructor(null));
            map.put("KeyTimeCycle", KeyTimeCycle.class.getConstructor(null));
            map.put("KeyTrigger", KeyTrigger.class.getConstructor(null));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    public KeyFrames(Context context, XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int eventType;
        Key key;
        HashMap map;
        HashMap map2;
        Key keyTimeCycle;
        try {
            eventType = xmlResourceParser.getEventType();
            key = null;
        } catch (IOException e) {
            Log.e("KeyFrames", "Error parsing XML resource", e);
            return;
        } catch (XmlPullParserException e2) {
            Log.e("KeyFrames", "Error parsing XML resource", e2);
            return;
        }
        while (eventType != 1) {
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (b.containsKey(name)) {
                    switch (name.hashCode()) {
                        case -300573030:
                            if (!name.equals("KeyTimeCycle")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            keyTimeCycle = new KeyTimeCycle();
                            keyTimeCycle.e(context, Xml.asAttributeSet(xmlResourceParser));
                            b(keyTimeCycle);
                            key = keyTimeCycle;
                            break;
                        case -298435811:
                            if (!name.equals("KeyAttribute")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            keyTimeCycle = new KeyAttributes();
                            keyTimeCycle.e(context, Xml.asAttributeSet(xmlResourceParser));
                            b(keyTimeCycle);
                            key = keyTimeCycle;
                            break;
                        case 540053991:
                            if (!name.equals("KeyCycle")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            keyTimeCycle = new KeyCycle();
                            keyTimeCycle.e(context, Xml.asAttributeSet(xmlResourceParser));
                            b(keyTimeCycle);
                            key = keyTimeCycle;
                            break;
                        case 1153397896:
                            if (!name.equals("KeyPosition")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            keyTimeCycle = new KeyPosition();
                            keyTimeCycle.e(context, Xml.asAttributeSet(xmlResourceParser));
                            b(keyTimeCycle);
                            key = keyTimeCycle;
                            break;
                        case 1308496505:
                            if (!name.equals("KeyTrigger")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            keyTimeCycle = new KeyTrigger();
                            keyTimeCycle.e(context, Xml.asAttributeSet(xmlResourceParser));
                            b(keyTimeCycle);
                            key = keyTimeCycle;
                            break;
                        default:
                            throw new NullPointerException("Key " + name + " not found");
                    }
                    return;
                }
                if (name.equalsIgnoreCase("CustomAttribute")) {
                    if (key != null && (map2 = key.d) != null) {
                        ConstraintAttribute.d(context, xmlResourceParser, map2);
                    }
                } else if (name.equalsIgnoreCase("CustomMethod") && key != null && (map = key.d) != null) {
                    ConstraintAttribute.d(context, xmlResourceParser, map);
                }
            } else if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                return;
            }
            eventType = xmlResourceParser.next();
        }
    }

    public final void a(MotionController motionController) {
        HashMap map = this.f2332a;
        ArrayList arrayList = (ArrayList) map.get(Integer.valueOf(motionController.c));
        if (arrayList != null) {
            motionController.w.addAll(arrayList);
        }
        ArrayList arrayList2 = (ArrayList) map.get(-1);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Key key = (Key) it.next();
                String str = ((ConstraintLayout.LayoutParams) motionController.b.getLayoutParams()).Y;
                String str2 = key.c;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    motionController.a(key);
                }
            }
        }
    }

    public final void b(Key key) {
        HashMap map = this.f2332a;
        if (!map.containsKey(Integer.valueOf(key.b))) {
            map.put(Integer.valueOf(key.b), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) map.get(Integer.valueOf(key.b));
        if (arrayList != null) {
            arrayList.add(key);
        }
    }
}
