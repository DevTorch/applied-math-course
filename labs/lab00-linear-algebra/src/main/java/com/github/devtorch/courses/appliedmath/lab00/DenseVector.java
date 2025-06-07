package com.github.devtorch.courses.appliedmath.lab00;

public record DenseVector(double[] data) implements Vector {

    @Override
    public int length() {
        return 0;
    }

    @Override
    public double at(int i) {
        return 0;
    }

    @Override
    public double dot(Vector other) {
        return 0;
    }

    @Override
    public Vector add(Vector other) {
        return null;
    }

    @Override
    public Vector sub(Vector other) {
        return null;
    }

    @Override
    public Vector scale(double lambda) {
        return null;
    }

    @Override
    public double norm() {
        return 0;
    }

    @Override
    public double[] toArray() {
        return new double[0];
    }
}
