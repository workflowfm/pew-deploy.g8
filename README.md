# pew-deploy.g8

Template to deploy WorkflowFM code for use with the [PEW engine](https://github.com/PetrosPapapa/WorkflowFM-PEW).

It sets up the appropriate sbt files and associated dependencies.

## Usage:

`sbt new WorkflowFM/pew-deploy.g8`

This will prompt you for a *project name* (among other options) and will build a directory with that name.

You can then deploy the generated code in the `*projectname*/src/main/scala` directory.

Run `sbt` to compile and run your new project.

## Note:

For your code to compile and run, you still need to install the [PEW engine](https://github.com/PetrosPapapa/WorkflowFM-PEW).
