package math;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 * @author Alek
 * @version 5/17/2016
 */
public class Data {
    private HashMap<Double, Double> xy;
    private static final double ERROR_CODE = 1E-19;

    public Data() {
        xy = new HashMap<Double, Double>();
    }

    public void addDataPoint(double x, double y) {
        xy.put(x, y);
    }

    public double getDataPointForX(double x) {
        Double val = xy.get(x);
        if(val == null)
            return ERROR_CODE;
        return val;
    }

    public double calcSx() {
        Set<Double> xvals = xy.keySet();
        double mean = calcMeanx();
        double stdDev = 0;
        for(Double d : xvals) {
            stdDev += Math.pow((d - mean),2);
        }
        stdDev /= (xvals.size() - 1);
        return stdDev;
    }

    public double calcSy() {
        Collection<Double> yvals = xy.values();
        double mean = calcMeany();
        double stdDev = 0;
        for(Double d : yvals) {
            stdDev += Math.pow((d - mean),2);
        }
        stdDev /= (yvals.size() - 1);
        return stdDev;
    }

    public double calcMeanx() {
        Set<Double> xvals = xy.keySet();
        double mean = 0;
        for (Double d : xvals) {
            mean += d;
        }
        mean /= xvals.size();
        return mean;
    }

    public double calcMeany() {
        Collection<Double> yvals = xy.values();
        double mean = 0;
        for (Double d : yvals) {
            mean += d;
        }
        mean /= yvals.size();
        return mean;
    }

    public LSRLLine calcLSRL() {
        return null;
    }
}
