package org.nibor.autolink.internal;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* loaded from: classes8.dex */
public class Scanners {
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x004c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x0052. Please report as an issue. */
    public static int a(int i, CharSequence charSequence) {
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != ',') {
                if (cCharAt == '[') {
                    i2++;
                } else {
                    if (cCharAt != ']') {
                        if (cCharAt != '`') {
                            if (cCharAt == '{') {
                                i3++;
                            } else if (cCharAt == '}') {
                                i3--;
                                if (i3 < 0) {
                                }
                                i4 = i;
                            } else if (cCharAt != 8239 && cCharAt != 8287 && cCharAt != 12288) {
                                if (cCharAt == '.') {
                                    continue;
                                } else if (cCharAt != '/') {
                                    if (cCharAt != '>') {
                                        if (cCharAt != '?') {
                                            if (cCharAt != 8232 && cCharAt != 8233) {
                                                switch (cCharAt) {
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case '\b':
                                                    case '\t':
                                                    case '\n':
                                                    case 11:
                                                    case '\f':
                                                    case '\r':
                                                    case 14:
                                                    case 15:
                                                    case 16:
                                                    case 17:
                                                    case 18:
                                                    case 19:
                                                    case 20:
                                                    case 21:
                                                    case 22:
                                                    case 23:
                                                    case 24:
                                                    case 25:
                                                    case 26:
                                                    case 27:
                                                    case 28:
                                                    case 29:
                                                    case 30:
                                                    case 31:
                                                    case ' ':
                                                    case '\"':
                                                        break;
                                                    case '!':
                                                        break;
                                                    default:
                                                        switch (cCharAt) {
                                                            case '\'':
                                                                boolean z2 = !z;
                                                                if (z) {
                                                                    i4 = i;
                                                                }
                                                                z = z2;
                                                                continue;
                                                            case '(':
                                                                i5++;
                                                                continue;
                                                            case ')':
                                                                i5--;
                                                                if (i5 < 0) {
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                switch (cCharAt) {
                                                                    case ':':
                                                                    case ';':
                                                                        break;
                                                                    case '<':
                                                                        break;
                                                                    default:
                                                                        switch (cCharAt) {
                                                                            case 127:
                                                                            case 128:
                                                                            case 129:
                                                                            case 130:
                                                                            case 131:
                                                                            case 132:
                                                                            case 133:
                                                                            case 134:
                                                                            case 135:
                                                                            case 136:
                                                                            case 137:
                                                                            case 138:
                                                                            case 139:
                                                                            case 140:
                                                                            case 141:
                                                                            case 142:
                                                                            case 143:
                                                                            case 144:
                                                                            case 145:
                                                                            case 146:
                                                                            case 147:
                                                                            case 148:
                                                                            case 149:
                                                                            case 150:
                                                                            case 151:
                                                                            case 152:
                                                                            case 153:
                                                                            case 154:
                                                                            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                                                                            case 156:
                                                                            case 157:
                                                                            case 158:
                                                                            case 159:
                                                                            case 160:
                                                                                break;
                                                                            default:
                                                                                switch (cCharAt) {
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                        i4 = i;
                                                        break;
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                } else if (i4 == i - 1) {
                                    i4 = i;
                                }
                            }
                        }
                        return i4;
                    }
                    i2--;
                    if (i2 < 0) {
                        return i4;
                    }
                    i4 = i;
                }
            }
            i++;
        }
        return i4;
    }
}
