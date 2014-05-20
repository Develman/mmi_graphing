package de.develman.mmi.model;

/**
 * Die Klasse Edge repräsentiert eine Kante in einem Graphen
 *
 * @author Georg Henkel <georg@develman.de>
 */
public class Edge
{
    private Double weight;
    private final Vertex source;
    private final Vertex sink;

    /**
     * Erstellt eine neue Kante mit Start- und Endknoten
     *
     * @param source Startknoten
     * @param sink Endknoten
     */
    public Edge(Vertex source, Vertex sink)
    {
        this.source = source;
        this.sink = sink;
        this.weight = Double.NaN;
    }

    /**
     * Erstellt eine neue Kante mit Start-, Endknoten und Gewicht
     *
     * @param source Startknoten
     * @param sink Endknoten
     * @param weight Gewicht
     */
    public Edge(Vertex source, Vertex sink, Double weight)
    {
        this.source = source;
        this.sink = sink;
        this.weight = weight;
    }

    /**
     * @return Startknoten der Kante
     */
    public Vertex getSource()
    {
        return source;
    }

    /**
     * @return Endknoten der Kante
     */
    public Vertex getSink()
    {
        return sink;
    }

    /**
     * @return Gewicht der Kante
     */
    public double getWeight()
    {
        return weight;
    }

    /**
     * Setzt ein neues Kantengewicht
     *
     * @param weight Das neue Gewicht der Kante
     */
    public void setWeight(Double weight)
    {
        this.weight = weight;
    }

    /**
     * @return Liefert die gegenläufige Kante
     */
    public Edge revert()
    {
        return new Edge(sink, source, weight);
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();

        builder.append(source);
        builder.append("->");
        builder.append(sink);

        if (!weight.isNaN())
        {
            builder.append(" (");
            builder.append(weight);
            builder.append(")");
        }

        return builder.toString();
    }
}
